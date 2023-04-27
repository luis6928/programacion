/**
 * 
 * Programa que muestra potencias segun la base
 * y el exponente que se introduzcan por teclado
 * 
 * @author Luis Ponce Garrido
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el exponente máximo: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());

    int potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
