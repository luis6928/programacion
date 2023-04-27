/**
* Programa que muestra el precio de una facturo
* con IVA y sin IVA
* 
*
* @author Luis Ponce Garrido
*/
public class  Ejercicio6 {

  public static void main(String[] args) {
	  
	  int baseImponible;
	  baseImponible= 49;
	  
	  double ivaAnadido;
	  ivaAnadido= 49*0.21;

    System.out.println("El precio de la factura(sin IVA)es= "+baseImponible);
    System.out.println("El precio de la factura(con IVA)es= "+(baseImponible+ivaAnadido));

		}
}
