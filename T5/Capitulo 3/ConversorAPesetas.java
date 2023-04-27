/**
* Conversor de euros a pesetas
*
* @author Luis Ponce Garrido
*/
public class ConversorAPesetas {
	public static void main(String[] args) {
		String linea;
		System.out.print("Por favor, introduce la cantidad de euros: ");
		linea = System.console().readLine();
	
		int euros;
		euros = Integer.parseInt( linea );
		
		
		int conversion;
		conversion =  euros * 166 ;
		
		System.out.print("La conversion son ");
		System.out.print(conversion + " pesetas");
		}
}

