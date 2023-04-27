import java.util.Scanner;
/**
* Programa que muestra 
* 
*
* @author Luis Ponce Garrido
*/
public class Ejercicio1  {
	 
	 //programa principal/////////////////////
	 
	 public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int n = s.nextInt();
	
	if (primo(n)){
		System.out.println(n+" es primo");
		}else{
			System.out.println(n+" no es primo");
			}
	}º1º
 //Funciones//////////////////////////////
	public static boolean primo(int x){
	
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
			return false;
			}
		}
		return true;
	}
}
    

 
