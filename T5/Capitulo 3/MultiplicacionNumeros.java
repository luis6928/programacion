/**
* Lectura de numeros desde teclado y 
* muestra su multiplicacion
*
* @author Luis Ponce Garrido
*/
public class MultiplicacionNumeros {
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
		total =  numero1 * numero2 ;
		
		System.out.print("La multiplicacion del primero por el  segundo es ");
		System.out.print(total);
		}
}

