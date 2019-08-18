import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private String fileName;
    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void write(String s) {
        try{
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(fileName));
            buffWrite.append(s);
            //buffWrite.append("\n");
            buffWrite.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}