import java.io.*; 
public class App {
	public static void main(String[] args) throws IOException{
		
		String fileName = "matriz.txt";
		String nextFileName = "matriz_transposta.txt";
		Reader reader = new Reader(fileName);

		// String matriz[][] = new String[reader.getLinesSize()][reader.getLinesSize()];

		// int lin = 0;
		// int col = 0;
		// for(int i = 0; i < reader.getSize(); i++) {
		// 	//System.out.println(i);
		// 	String x = reader.getContent();
		// 	matriz[lin][col] = Character.toString(x.charAt(i));
		// 	//System.out.println(matriz[lin][col]);
		// 	col++;
		// 	if(col%reader.getLinesSize()==0){
		// 		lin++;
		// 		col = 0;
		// 		System.out.println("==");
		// 	}
		// }




		try{
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nextFileName));
			for(int i = 0; i<reader.getMatrix().length; i++) {
				for(int j= 0; j < reader.getMatrix().length; j++ ) {
					//System.out.println(matriz[j][i]); // adicionar no lccol;
					buffWrite.append(reader.getMatrix()[j][i]);
				}
				buffWrite.append("\n");
			}
            //buffWrite.append(s);
            //buffWrite.append("\n");
            buffWrite.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }


		


	}
}
