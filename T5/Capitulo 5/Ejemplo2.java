import java.util.Scanner;
/**
* Programa que cuenta desde el 0 
* hasta un numero introducido por teclado 
	* 
*
* @author Luis Ponce Garrido
*/
public class  Ejemplo2 {

  public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.print("Introduce un numero para el contador: ");
	int contFinal = s.nextInt();

	for (int cont=0; cont<=contFinal; cont=cont+1){
		System.out.println(cont);
	 }
  }
}
