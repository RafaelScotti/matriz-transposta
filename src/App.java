public class App {
    public static void main(String[] args) {        
        
        String squareMatrix[][] = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"}
        };
        

        String originalFile = "original.txt";
        String old = "old.txt";
        String gen = "gen.txt";

        Writer writer = new Writer();
        Reader original = new Reader(originalFile);
        writer.writeIn(gen, original.toMatrix());
        
        Reader reader = new Reader(gen);
        Matrix matrix = new Matrix(reader.toMatrix());

        // init files


        

        // to make the transpose
        writer.writeIn(old, reader.toMatrix());
        writer.writeIn(gen, matrix.changeValue("A", "Z"));


        //matrix.print();
        //System.out.println("\n\n");
        //matrix.print(matrix.transpose());
        //matrix.transpose();
    
    }
}