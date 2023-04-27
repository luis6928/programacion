import java.util.Scanner;
/**
 * Programa que calcula la nota media
 del alumno
 *
 * @author Luis Ponce Garrido
 */
public class Ejercicio21 {
  public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
    System.out.print("Nota del primer control: ");
		double nota1=s.nextDouble();

		Scanner d = new Scanner(System.in);
    System.out.print("Nota del segundo control: ");
    double nota2=d.nextDouble();
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      Scanner f = new Scanner(System.in);
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = f.nextLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.print("Tu nota de Programación es " + media);
  }
}
