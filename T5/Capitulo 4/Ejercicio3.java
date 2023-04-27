import java.util.Scanner;
/**
* Programa que dice el dia de la semana segun el numero
* 
*
* @author Luis Ponce Garrido
*/
public class Ejercicio3 {

  public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.print("Introduce el dia de la semana: ");
	int numeroDia = s.nextInt();
	
	String dia;
	
	switch (numeroDia) {
	case 1:
	dia = "Lunes";
	break;
	
	case 2:
	dia = "Martes";
	break;
	
	case 3:
	dia = "Miercoles";
	break;
	
	case 4:
	dia = "Jueves";
	break;
	
	case 5:
	dia = "Viernes";
	break;
	
	case 6:
	dia = "Sabado";
	break;
	
	case 7:
	dia = "Domingo";
	break;
	
	default:
	dia = "no existe ese dia";
}
	
	System.out.print("Ese dia es el: "+dia);


  }
}
