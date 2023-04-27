import java.util.Scanner;
/**
* Programa que resuelve una ecuacion de segundo grado 
* 
*
* @author Luis Ponce Garrido
*/
public class  Ejercicio9{
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduce a, b y c separados por espacios: ");
	double a = s.nextDouble();
	double b = s.nextDouble();
	double c = s.nextDouble();
	
	double raiz;
	raiz=Math.sqrt(b*b-4*a*c);
	
	double ecuacion1;
	ecuacion1 = (((-b)+raiz)/2);
	
	double ecuacion2;
	ecuacion2 = (((-b)-raiz)/2);
	
	System.out.println("x1= "+ecuacion1);
	
	System.out.println("x2= "+ecuacion2);
	}
}
