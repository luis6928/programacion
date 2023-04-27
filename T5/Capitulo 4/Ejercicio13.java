import java.util.Scanner;
/**
* Programa que pregunta tres numero enteros y los ordena de menor a mayor
*
* @author Luis José Sánchez
*/
public class Ejercicio13 {
	public static void main(String[] args) {
		int orden;
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce 3 numeros para ordenarlos de menor a mayor: ");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();

		if (a > b) {
			orden = a;
			a = b;
			b = orden;
		}

		if (b > c) {
			orden = b;
			b = c;
			c = orden;
		}

		if (a > b) {
			orden = a;
			a = b;
			b = orden;
		}
		System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
	}
}
