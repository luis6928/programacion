import java.util.Scanner;
/**
* Programa que muestra la primera hora del horario segun el dia
* 
*
* @author Luis Ponce Garrido
*/
public class Ejercicio1 {

  public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.print("Introduce el dia de la semana: ");
	int numeroDia = s.nextInt();
	
	String asignatura;
	
	switch (numeroDia) {
	case 1:
	asignatura = "FOL";
	break;
	
	case 2:
	
	case 3:
	asignatura = "Bases de datos";
	break;
	
	case 4:
	asignatura = "Sistemas informaticos";
	break;
	
	case 5:
	asignatura = "Lenguaje de Marcas";
	break;
	
	default:
	asignatura = "no existe ese dia";
}
	
	System.out.print("La primera hora de ese dia es: "+asignatura);


  }
}
