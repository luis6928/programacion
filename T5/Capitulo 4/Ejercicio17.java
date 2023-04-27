import java.util.Scanner;
/**
* Programa que muestra la ultima cifra de
* un numero introducido por teclado
* 
*
* @author Luis Ponce Garrido
*/
public class  Ejercicio17 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca un numero entero: ");
    int numero = s.nextInt();
    System.out.println("La última cifra es " + (numero % 10));

  }
}
