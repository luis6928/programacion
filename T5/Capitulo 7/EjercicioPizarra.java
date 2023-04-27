import java.util.Scanner;
/**
* Programa que muestra 
* 
*
* @author Luis Ponce Garrido
*/
public class EjercicioPizarra  {

  public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f;
		f=s.nextInt();
    
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    int [] n=new int[f];
    
    for (int i=0; i<f; i++){
			n[i]=(int)(Math.random()*11+50);
			
			if(max>n[i]){
				max=n[i];
			}
    }
		for(int i=0; i<f; i++){
			if (n[i]==max){
				System.out.print("*"+n[i]+"*");}
			
		}	
  }
}
