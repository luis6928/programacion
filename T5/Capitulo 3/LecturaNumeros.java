/**
* Lectura de numeros desde teclado
*
* @author Luis Ponce Garrido
*/
public class LecturaNumeros {
	public static void main(String[] args) {
		String linea;
		System.out.print("Por favor, introduce un número: ");
		linea = System.console().readLine();
	
		int numero1;
		numero1 = Integer.parseInt( linea );
		
		System.out.print("introduce otro, por favor: ");
		linea = System.console().readLine();
		
		int numero2;
		numero2 = Integer.parseInt( linea );
		
		int total;
		total = (4 * numero1) + numero2 * 2;
		
		System.out.print("El primer número introducido es " + numero1);
		System.out.println(" y el segundo es " + numero2);
		System.out.print("El cuadruple del primer número más el doble del segundo es ");
		System.out.print(total);
		}
}

