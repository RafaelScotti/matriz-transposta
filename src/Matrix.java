public class Matrix {
    private String matrix[][];
    private int lineCount = 0;
    private int columnCount = 0;

    public Matrix(String[][] matrix) {
        this.matrix = matrix;
        this.lineCount = matrix.length;
    }

    public String[][] getMatrix() {
        return this.matrix;
    }

    public void print() {
        for(int i = 0; i < this.lineCount; i++) {
            for(int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j]);
            }
            System.out.print(System.lineSeparator());
        }
    }

    
    public void print(String[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print(System.lineSeparator());
        }
    }


    public String[][] transpose() {
        
        if(isSquare()){
            String auxMatrix[][] = new String[lineCount][lineCount];
            for(int i = 0; i < this.lineCount; i++) {
                for(int j = 0; j < this.matrix[i].length; j++) {
                    auxMatrix[i][j] = this.matrix[j][i];
                }
                //System.out.print(System.lineSeparator());
            }
            return auxMatrix;
        }
        return this.matrix;
        
    }

    public String[][] changePositionValue(int lin, int col) {
        return this.matrix;
    }

    public boolean isSquare() {
        // TODO
        return true;
    }

}