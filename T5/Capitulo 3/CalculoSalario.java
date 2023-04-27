import java.util.Scanner;
/**
* Calculo de un salario semanal a 
* partir de lo que se cobra por hora
*
* @author Luis Ponce Garrido
*/
public class CalculoSalario {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero de horas de trabajo diarias: ");
		int horas = s.nextInt();
		
		int salario;
		salario=(12*horas)*7;
		
		System.out.println("Tu sueldo semanal es de "+salario);
		}
}
