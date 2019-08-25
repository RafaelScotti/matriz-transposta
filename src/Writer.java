import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private String fileName;

    public void writeIn(String fileName, String[][] matrix) {
        
        try{
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(fileName));
			for(int i = 0; i< matrix.length; i++) {
				for(int j= 0; j < matrix[i].length; j++ ) {
					buffWrite.append(matrix[i][j]);
				}
				buffWrite.append(System.lineSeparator());
			}
			buffWrite.close();
			
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }


    }

}