import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String originalFile = "original.txt";
    String old = "old.txt";
    String gen = "gen.txt";
    Writer writer = new Writer();
    Reader original = new Reader(originalFile);
    Reader reader;
    Matrix matrix;
    public Menu() {
        Reader reader = new Reader(gen);
        if(reader.isEmpty()){
            //System.out.println("a");
            writer.writeIn(gen, original.toMatrix());
            reader = new Reader(gen);
        }         
        matrix = new Matrix(reader.toMatrix());
    }
    
    // String squareMatrix[][] = {
        //     {"a", "b", "c"},
        //     {"d", "e", "f"},
        //     {"g", "h", "i"}
        // };

    public void show() {
        
        int option = 0;

        do {
            System.out.println("\n|=============Main menu============|");
            System.out.println("|                                  |");
            System.out.println("| ( 1 )  Print                     |");
            System.out.println("| ( 2 )  Transpose                 |");
            System.out.println("| ( 3 )  Change a value            |");
            System.out.println("| ( 4 )  Exit                      |");
            System.out.println("|__________________________________|");
            System.out.println("");
            System.out.println("Choose one or several options:  ");
            System.out.print(  "> ");
            option = Integer.parseInt(scanner.nextLine());
            //System.out.println("\nYou chose option " + option + "!");
            action(option);
        }while (option != 4);
        
    }
    private void action(int chose) {
        reader = new Reader(gen);
        matrix = new Matrix(reader.toMatrix());

        switch (chose) {
            case 1:
                matrix.print();
                break;
            case 2:              
                writer.writeIn(old, matrix.getMatrix());
                writer.writeIn(gen, matrix.transpose());
                break;
            case 3:
                String oldLetter = "";
                String newLetter = "";
                System.out.println("Enter the letter you would like to change ");
                System.out.print("> ");
                oldLetter = scanner.nextLine();

                System.out.println("Enter the new letter ");
                System.out.print("> ");
                newLetter = scanner.nextLine();

                System.out.println("\nChanging all the letters "+oldLetter+" to "+newLetter+" ... \nDone!\n");

                writer.writeIn(old, matrix.getMatrix());
                writer.writeIn(gen, matrix.changeValue(oldLetter, newLetter));
                break;
            case 4:
                // TODO
                break;
            default:
                break;
        }
    }


}
