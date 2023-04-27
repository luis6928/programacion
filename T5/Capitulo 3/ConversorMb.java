import java.util.Scanner;
/*
* Conversion de mb a kb
*
* @author Luis Ponce Garrido
*/
public class ConversorMb {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de mb: ");
		double mb = s.nextDouble();
				
		double conversion;
		conversion=mb*1000;
		
		System.out.println("La conversion es= "+conversion);
		}
}
