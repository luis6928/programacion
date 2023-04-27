/**
* Programa que muestra 
* 
*
* @author Luis Ponce Garrido
*/
public class EjercicioX {

  public static void main(String[] args) {

    int [][]  s= new int[6] [4];
    int suma=1;
    int f,c;
    
    for( c=0; c<4; c++){
			for( f=0; f<6; f++){
				s[f] [c]=suma;
				suma=suma+1;
			}
		}
		for(c=0; c<6; c++){
			for(f=0; f<4; f++){
				System.out.printf("%10d",s[c] [f]);
				}
   System.out.println("");
    }

  }
}
