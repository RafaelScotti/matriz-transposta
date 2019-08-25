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

    public String[][] toMatrix() {
        
        int linSize = this.content.size();
        int colSize = getTheBiggestLine();
        String matrix[][] = new String[linSize][colSize];
        
        for(int i = 0; i < linSize; i++) {
            String aux = content.get(i);
            for(int j = 0; j < colSize; j++) {
                matrix[i][j] = Character.toString(aux.charAt(j));
            }
        }
        return matrix;
    }

    public int getTheBiggestLine() {
        int size = 0;
        for(int i = 0; i < content.size(); i++) {
            if(content.get(i).length() >= size){
                size = content.get(i).length();
            }
        }
        return size;
    }

    // TODO
    public void makeSquare() {
        int linSize = this.content.size();
        int colSize = getTheBiggestLine();
        System.out.println(linSize + "  "+ colSize);

        for(int i = 0; i < linSize; i++) {
            String aux = this.content.get(i).toString();
            String complete = "";
            //System.out.println(aux.length());
            //System.out.println(content.get(i).length());
            //this.content.add(i, aux+complete);
            //System.out.println(aux);    
        }
    }


}


