/**
* Programa que lee dos numeros y realiza 
* diferentes calculos
*
* @author Luis Ponce Garrido
*/
public class OperacionesNumeros {
	public static void main(String[] args) {
		String linea;
		System.out.print("Por favor, introduce un numero entero: ");
		linea = System.console().readLine();
		
		String linea2;
		System.out.print("Por favor, introduce otro numero entero: ");
		linea2 = System.console().readLine();
	
		int num1;
		num1 = Integer.parseInt( linea );
		
		int num2;
		num2 = Integer.parseInt( linea2 );
		
		int suma;
		suma =  num1 + num2;
		
		int resta;
		resta =  num1 - num2;
		
		int producto;
		producto =  num1 * num2;
		
		int division;
		division =  num1 / num2;
		
		System.out.println("La suma es= "+suma);
		
		System.out.println("La resta es= "+resta);
		
		System.out.println("La multiplicacion es= "+producto);
		
		System.out.println("La división es= "+division);
		}
}

