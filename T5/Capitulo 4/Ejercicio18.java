import java.util.Scanner;
/**
* Programa que muestra 
* 
*
* @author Luis Ponce Garrido
*/
public class Ejercicio18 {

  public static void main(String[] args) {

    int primera = 0;
    
    Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un numero natural de hasta 5 cifras: ");
		int n = s.nextInt();
    
    if ( n < 10 ) {
      primera = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      primera = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primera = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primera = n / 1000;
    }
    
    if ( n >= 10000 ) {
      primera = n / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primera + ".");
  }
}
