/**
* Conversor de pesetas a euros
*
* @author Luis Ponce Garrido
*/
public class ConversorAEuros {
	public static void main(String[] args) {
		String linea;
		System.out.print("Por favor, introduce la cantidad de pesetas: ");
		linea = System.console().readLine();
	
		int pesetas;
		pesetas = Integer.parseInt( linea );
		
		
		double conversion;
		conversion =  pesetas * 0.006;
		
		System.out.print("La conversion son ");
		System.out.print(conversion + " euros");
		}
}

