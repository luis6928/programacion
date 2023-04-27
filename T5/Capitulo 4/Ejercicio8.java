import java.util.Scanner;
/**
* Programa que calcula la nota media y dice la nota del boletin
* 
*
* @author Luis Ponce Garrido
*/
public class  Ejercicio8{
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduce las 3 notas separadas por espacios: ");
	double nota1 = s.nextDouble();
	double nota2 = s.nextDouble();
	double nota3 = s.nextDouble();
	
	double media;
	media = (nota1+nota2+nota3)/3;
	
	System.out.println("La nota media es= "+media);
	
	if (media<5) {
	System.out.println("Insuficiente");
	} else if(media==5) {
	System.out.println("Suficiente");
	} else if (media==6) {
	System.out.println("Bien");
	} else if (media<=8) {
	System.out.println("Notable");
	} else if (media<=10) {
	System.out.println("Sobresaliente");
	}
   
    }
}
