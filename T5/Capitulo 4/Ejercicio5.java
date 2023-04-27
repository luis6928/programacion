/**
 * 4. Sentencia Condicional
 *
 * @author LuisPonce Garrido
 */

public class Ejercicio5 {
  public static void main(String[] args) {

    System.out.println("Por favor, introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("No se puede resolver.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
