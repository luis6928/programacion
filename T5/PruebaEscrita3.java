/**
* Programa que muestra 
* 
*
* @author Luis Ponce Garrido
*/
public class  PruebaEscrita3{

  public static void main(String[] args) {

		String nombre;
		System.out.print("Dime tu nombre: ");
		nombre = System.console().readLine();

		String lineaEdad;
		System.out.print("Ahora dime tu edad: ");
		lineaEdad = System.console().readLine();
		
		int edad;
		edad = Integer.parseInt( lineaEdad );
		
		System.out.println("Mi nombre es: " + nombre + " y tengo "+ edad+" años" );

		}
}
