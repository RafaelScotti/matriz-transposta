import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException{
		
		String fileName = "matriz.txt";
		String nextFileName = "matriz_transposta.txt";
		Reader reader = new Reader(fileName);

		
		try{
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nextFileName));
			for(int i = 0; i<reader.getMatrix().length; i++) {
				for(int j= 0; j < reader.getMatrix().length; j++ ) {
					buffWrite.append(reader.getMatrix()[j][i]);
				}
				buffWrite.append("\n");
			}
			buffWrite.close();
			
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
	

		System.out.println("====Matriz Original====");
		for(int i = 0; i < reader.getMatrix().length; i++){
			for(int j = 0; j < reader.getMatrix().length; j++) {
				System.out.print(reader.getMatrix()[i][j]);
			}
			System.out.println("");
		}

		System.out.println("\n\n===Matriz Resultante===");
		for(int i = 0; i < reader.getMatrix().length; i++){
			for(int j = 0; j < reader.getMatrix().length; j++) {
				System.out.print(reader.getMatrix()[j][i]);
			}
			System.out.println("");
		}

	
	}
}
