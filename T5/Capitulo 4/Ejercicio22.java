import java.util.Scanner;
/**
 *
 * Programa que calcula cuanto falta
 para que llegue el fin de semana(viernes 15:00)
 *
 * @author Luis Ponce Garrido
 */
public class Ejercicio22 {
  public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un día de la semana: ");
    String dia = s.nextLine();

    int diaNumerico = 0;

    switch(dia) {
      case "lunes":
        diaNumerico = 0;
        break;
      case "martes":
        diaNumerico = 1;
        break;
      case "miércoles":
      case "miercoles":
        diaNumerico = 2;
        break;
      case "jueves":
        diaNumerico = 3;
        break;
      case "viernes":
        diaNumerico = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    
    Scanner h = new Scanner(System.in);
    System.out.print("Hora: ");
    int horas = h.nextInt();
    
    Scanner m = new Scanner(System.in);
    System.out.print("Minutos: ");
    int minutos = m.nextInt();
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}
