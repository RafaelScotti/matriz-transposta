import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Reader {

    private String fileName = "";
    private int size = 0;
    private String content = "";

    public Reader(String fileName) {
        this.fileName = fileName;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
    
            while (line != null) {
                sb.append(line);
                //sb.append(System.lineSeparator());
                line = br.readLine();
                //this.size++;
            }
            this.content = sb.toString();
            br.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
		}
    }

    public String getContent() {
        return this.content;
    }

    public int getSize() {
        return this.content.length();
    }

    public int getLinesSize() {
        return (int)Math.sqrt(getSize());
    }

        

}


