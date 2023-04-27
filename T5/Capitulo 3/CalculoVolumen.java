import java.util.Scanner;
/*
* Calculo del volumen de un objeto a partir de su
* radio y la altura 
*
* @author Luis Ponce Garrido
*/
public class CalculoVolumen {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el radio y la altura separados por un espacio: ");
		double radio = s.nextDouble();
		double altura = s.nextDouble();
				
		double volumen;
		volumen=(3.14*radio*radio*altura)/3;
		
		System.out.println("El volumen es= "+volumen);
		}
}
