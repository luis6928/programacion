import java.util.Scanner;
/*
* Conversion de kb a mb
*
* @author Luis Ponce Garrido
*/
public class ConversorKb {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de kb: ");
		double kb = s.nextDouble();
				
		double conversion;
		conversion=kb/1000;
		
		System.out.println("La conversion es= "+conversion);
		}
}
