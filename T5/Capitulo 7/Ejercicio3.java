import java.util.Scanner;
/*
 * 
 * 
 * @author Luis Ponce Garrido
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[]num=new int[10];
		
		for (int i=0; i<10; i++){
		System.out.print("Introduzca el numero"+ i + ": ");
		num[i]=s.nextInt();
		}

		for (int i=9; i>0; i--){
		System.out.println("Numero "+i+" ="+num[i]);
		}

	}
}
