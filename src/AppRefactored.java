
public class AppRefactored {
    public static void main(String[] args) {        
        
        String squareMatrix[][] = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"}
        };
        Matrix matrix = new Matrix(squareMatrix);

        Reader reader = new Reader("matriz.txt");

        reader.print();

        reader.makeSquare();

        System.out.println("\n");

        //reader.print();

        //matrix.print();
        //matrix.print(matrix.transpose());
        //matrix.transpose();
    
    }
}