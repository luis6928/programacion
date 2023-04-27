import java.util.Scanner;
/**
* Programa que muestra  los segundos que faltan hasta la media noche
* 
*
* @author Luis Ponce Garrido
*/
public class  Ejercicio11 {

  public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la hora y los minutos separados por un espacio: ");
    int horas = s.nextInt();
    int minutos = s.nextInt();
    
    int segHoras;
    segHoras=horas*3600;
    
    int segMinutos;
    segMinutos=minutos*60;
    
    int segDia;
    segDia=86400-(segHoras+segMinutos);
    
     System.out.println("Faltan: "+segDia+" segundos para la media noche");

  }
}
