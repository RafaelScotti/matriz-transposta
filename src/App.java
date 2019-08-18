import java.io.*; 
public class App {


	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		char matriz[][] = new char[4][4];
		
//		for(int i = 0; i<lc.length; i++) {
//			for(int j= 0; j < lc.length; j++ ) {
//				System.out.println(lc[i][j]);
//			}
//		}
		// System.out.println("======");
		// for(int i = 0; i<lc.length; i++) {
		// 	for(int j= 0; j < lc.length; j++ ) {
		// 		System.out.println(lc[j][i]); // adicionar no lccol;
		// 	}
		// 	System.out.println("");
		// }
		

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        //sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
            
            System.out.println(everything.length());

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



            BufferedWriter buffWrite = new BufferedWriter(new FileWriter("matriz_transposta.txt"));
            //String linha = "";
            //Scanner in = new Scanner(System.in);
            //System.out.println("Escreva algo: ");
            //linha = in.nextLine();

            for(int i = 0; i<matriz.length; i++) {
			    for(int j= 0; j < matriz.length; j++ ) {
                    //System.out.println(matriz[j][i]); // adicionar no lccol;
                    buffWrite.append(matriz[j][i]);
			    }
			    buffWrite.append("\n");
		    }

            
            buffWrite.close();


		} finally {
		    br.close();
		}
        
        



	}

}
