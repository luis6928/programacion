import java.util.Scanner;
/**
* Programa que muestra si un numero es par y
* si es divisible entre 5
* 
*
* @author Luis Ponce Garrido
*/
public class Ejercicio14  {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el numero: ");
    int num = s.nextInt();
    
    if ((num % 2) == 0) {
      System.out.print("El número es par");
    } else {
      System.out.print("El número no es par");
    }

    if ((num % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
}
