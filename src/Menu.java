import java.util.Scanner;

public class Menu {

    private final String originMatrixFileName = "matriz.txt";
    private final String modifiedMatrixFileName = "matriz_modificada.txt"
    private final String generatedMatrixFileName = "matriz_gerada.txt";

    // String squareMatrix[][] = {
        //     {"a", "b", "c"},
        //     {"d", "e", "f"},
        //     {"g", "h", "i"}
        // };

    Scanner scanner = new Scanner(System.in);
    Writer writer = new Writer();
    Reader reader = new Reader(originMatrixFileName);
    Matrix matrix = new Matrix(reader.toMatrix());

    

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
        switch (chose) {
            case 1:
                matrix.print();
                break;
            case 2:
                writer.writeIn(generatedMatrixFileName, matrix.transpose());
                matrix.print(new Reader(modifiedMatrixFileName).toMatrix());
                break;
            case 3:
                // TODO
                break;
            case 4:
                // TODO
                break;
            default:
                break;
        }
    }
}
