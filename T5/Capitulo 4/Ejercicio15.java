/**
* Programa que muestra una piramide con un relleno
* y orientacion elegidos por teclado
* 
*
* @author Luis Ponce Garrido
*/
public class Ejercicio15 {

  public static void main(String[] args) {
        
    System.out.print("Introduzca un simbolo: ");
    String s = System.console().readLine();
    System.out.println("Elije el tipo de pirámide");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    int tipo = Integer.parseInt(System.console().readLine());

    switch(tipo) {
      case 1:
        System.out.println("  " + s);
        System.out.println(" " + s + s + s);
        System.out.println(s + s + s + s + s);
        break;
      case 2:
        System.out.println(s + s + s + s + s);
        System.out.println(" " + s + s + s);
        System.out.println("  " + s);
        break;
      case 3:
        System.out.println("    " + s);
        System.out.println("  " + s + " " + s);
        System.out.println(s + " " + s + " " + s);
        System.out.println("  " + s + " " + s);
        System.out.println("    " + s);
        break;
      case 4:
        System.out.println(s);
        System.out.println(s + " " + s);
        System.out.println(s + " " + s + " " + s);
        System.out.println(s + " " + s);
        System.out.println(s);
        break;
      default:
    }
  }
}
