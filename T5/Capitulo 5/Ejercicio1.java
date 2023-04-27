/**
* Programa que cuenta los numeros multiplos
* de 5 desde 0 a 100
* 
*
* @author Luis Ponce Garrido
*/
public class  Ejercicio1 {

  public static void main(String[] args) {

	for (int cont=0; cont<=100; cont=cont+1){
	  if(cont%5==0){
		System.out.println(cont);
	  }
	}
  }
}
