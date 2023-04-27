/**
* Lectura de nombre y apellidos desde teclado
*
* @author Luis Ponce Garrido
*/
public class LecturaNombreApellido {
	public static void main(String[] args) {
		String nombre;
		System.out.print("Por favor, dime cómo te llamas: ");
		nombre = System.console().readLine();
		System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");

		String apellidos;
		System.out.print("Por favor, ahora dime tus apellidos: ");
		apellidos = System.console().readLine();
		System.out.println("Muchas gracias " + nombre + " "+ apellidos );
		}
}
