/**
* Sentencia if
*
* @author Luis J. Sánchez
*/
public class Ejemplo2 {
  public static void main(String[] args) {
	System.out.print("¿Cuál es el idioma oficial de Nueva Zelanda? ");
	String respuesta = System.console().readLine();
	respuesta=respuesta.toLowerCase();
	
	if (respuesta.equals("maori")) {
	System.out.println("¡La respuesta es correcta!");
	} else {
	  System.out.println("Lo siento, la respuesta es incorrecta.");
	}
  }
}
