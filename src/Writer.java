import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private String fileName;
    private boolean append;
    public Writer(String fileName, boolean append) {
        this.fileName = fileName;
        this.append = append;
    }

    public void write(String s) {
        try{
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(fileName, append));
            buffWrite.append(s);
            //buffWrite.append("\n");
            buffWrite.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }   
    }
}