import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Reader {

    private String fileName = "";
    // String content = "";

    private ArrayList<String> content = new ArrayList<>();


    public Reader(String fileName) {
        this.fileName = fileName;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
    
            while (line != null) {
                //sb.append(line);
                content.add(line.toString());
                //sb.append(System.lineSeparator());
                line = br.readLine();
            }
            //this.content = sb.toString();
            
            br.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
		}
    }

    public void print() {
        for (String line : content) {
            System.out.println(line);
        };
    }

    // public int getSize() {
    //     return this.content.length();
    // }

    // public int getLineSize() {
    //     return (int)Math.sqrt(getSize());
    // }

    // public String[][] toMatrixOld() {
    //     String matrix[][] = new String[this.content.length()][this.content.get(0).length()];

	// 	int lin = 0;
	// 	int col = 0;
	// 	for(int i = 0; i < this.getSize(); i++) {
	// 		String content = getContent();
	// 		matrix[lin][col] = Character.toString(content.charAt(i));
	// 		col++;
	// 		if(col%getLineSize()==0){
	// 			lin++;
	// 			col = 0;
	// 		}
    //     }
    //     return matrix;
    // }    

    // public String[][] toMatrix() {
        
    //     int linSize = this.content.length();
    //     int colSize = getTheBiggestLine();
    //     String matrix[][] = new String[linSize][colSize];
        
    //     for(int i = 0; i < linSize; i++) {
    //         for(int j = 0; j < colSize; j++) {
    //             matrix[i][j] = 
    //         }
    //     }

    // }

    public int getTheBiggestLine() {
        int size = 0;
        for(int i = 0; i < content.size(); i++) {
            if(content.get(i).length() >= size){
                size = content.get(i).length();
            }
        }
        return size;
    }

    public void makeSquare() {
        int linSize = this.content.size();
        int colSize = getTheBiggestLine();
        System.out.println(linSize + "  "+ colSize);

        for(int i = 0; i < linSize; i++) {
            String x = this.content.get(i).toString();
            System.out.println(x);
                
            if(x.length() < 10) {
                x = "AAA";
            }
            
            this.content.add(i, x);
            
            
               
        }
    }


}


