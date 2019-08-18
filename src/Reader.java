import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public String toString() {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
    
            while (line != null) {
                sb.append(line);
                //sb.append(System.lineSeparator());
                line = br.readLine();
            }
            text = sb.toString();
            br.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
		}
		
        return text;
    }

    

        

}


