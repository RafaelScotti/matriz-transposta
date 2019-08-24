
public class AppRefactored {
    public static void main(String[] args) {        
        
        String squareMatrix[][] = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"}
        };
        Writer writer = new Writer();
        Reader reader = new Reader("matriz.txt");
        Matrix matrix = new Matrix(reader.toMatrix());

        writer.writeIn("teste.txt", matrix.transpose());


        //matrix.print();
        matrix.print(matrix.transpose());
        //matrix.transpose();
    
    }
}