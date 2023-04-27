/**
* Programa que muestra 
* 
*
* @author Luis Ponce Garrido
*/
public class  PruebaEscrita4{

  public static void main(String[] args) {

		String linea;
		System.out.print("Dime tu año de nacimiento: ");
		linea = System.console().readLine();
		
		int year;
		year = Integer.parseInt( linea );
		
		String month;
		System.out.print("Ahora dime el mes: ");
		month = System.console().readLine();
		
		String linea3;
		System.out.print("Por ultimo dime el dia: ");
		linea3 = System.console().readLine();
		
		int day;
		day = Integer.parseInt( linea3);
		
		System.out.println("Mi fecha de nacimiento es el: " + day + " de "+ month+" del "+year );

		}
}
