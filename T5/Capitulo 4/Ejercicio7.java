import java.util.Scanner;
/**
* Programa que calcula la nota media 
* 
*
* @author Luis Ponce Garrido
*/
public class  Ejercicio7{
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduce las 3 notas separadas por espacios: ");
	double nota1 = s.nextDouble();
	double nota2 = s.nextDouble();
	double nota3 = s.nextDouble();
	
	double media;
	media = (nota1+nota2+nota3)/3;
   
    System.out.println("La nota media es= "+media);

	}
}
