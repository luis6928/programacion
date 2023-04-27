import java.util.Scanner;
/**
* Calculo de un salario semanal a 
* partir de lo que se cobra por hora
*
* @author Luis Ponce Garrido
*/
public class CalculoNotaMedia {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la nota del primer examen: ");
		double notaExamen1 = s.nextDouble();
		
		System.out.print("Introduce la media deseada: ");
		double notaDeseada = s.nextDouble();
		
		double notaExamen2;
		notaExamen2=((notaDeseada*100)-(notaExamen1*40))/60;
		
		System.out.println("Tu nota en el siguiente examen deberia ser "+notaExamen2);
		}
}
