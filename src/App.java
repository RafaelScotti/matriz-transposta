import java.io.*; 
public class App {
	public static void main(String[] args) throws IOException{
		
		Writer writer = new Writer("matriz_t.txt");
		Reader reader = new Reader("file.txt");

		String matriz[][] = new String[reader.getLinesSize()][reader.getLinesSize()];

		int lin = 0;
		int col = 0;
		for(int i = 0; i < reader.getSize(); i++) {
			//System.out.println(i);
			String x = reader.getContent();
			matriz[lin][col] = Character.toString(x.charAt(i));
			System.out.println(matriz[lin][col]);
			col++;
			if(col%4==0){
				lin++;
				col = 0;
				System.out.println("==");
			}
		}

		System.out.println(reader.getSize());
		System.out.println(reader.getContent());

		for(int i = 0; i<matriz.length; i++) {
			for(int j= 0; j < matriz.length; j++ ) {
				System.out.println(matriz[j][i]); // adicionar no lccol;
				writer.write(matriz[j][i]);
			}
			writer.write("\n");
		}


	}
}
