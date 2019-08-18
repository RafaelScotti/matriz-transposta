import java.io.*; 
public class App {


	
	public static void main(String[] args) throws IOException{
		

		
		char matriz[][] = new char[4][4];
			

        

		int lin = 0;
		int col = 0;
		for(int i = 0; i < everything.length(); i++) {
			//System.out.println(i);
			matriz[lin][col] = everything.charAt(i);
			//System.out.println(i + ": " + matriz[lin][col]);
			col++;
			if(col%4==0){
				lin++;
				col = 0;
				//System.out.println("==");
			}
		}

		// inverter
		System.out.println("======");
		for(int i = 0; i<matriz.length; i++) {
			for(int j= 0; j < matriz.length; j++ ) {
				System.out.println(matriz[j][i]); // adicionar no lccol;
			}
			System.out.println("");
		}

		for(int i = 0; i<matriz.length; i++) {
			for(int j= 0; j < matriz.length; j++ ) {
				//System.out.println(matriz[j][i]); // adicionar no lccol;
				buffWrite.append(matriz[j][i]);
			}
			buffWrite.append("\n");
		}
	}
}
