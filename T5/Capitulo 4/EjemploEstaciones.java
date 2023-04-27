/**
* Sentencia múltiple (switch)
*
* @author Luis Ponce Garrido
*/
public class EjemploEstaciones {
  public static void main(String[] args) {
	
	System.out.print("Por favor, introduzca un numero de mes: ");
	int mes = Integer.parseInt(System.console().readLine());
	String nombreDelMes;
	
	switch (mes) {
	
	case 1:
	
	case 2:
	nombreDelMes = "invierno";
	break;
	
	case 3:
	
	case 4:
	
	case 5:
	
	case 6:
	nombreDelMes = "primavera";
	break;

	case 7:
	
	case 8:
	
	case 9:
	nombreDelMes = "verano";
	break;
	
	case 10:

	case 11:
	nombreDelMes = "otoño";
	break;
	
	case 12:
	nombreDelMes = "invierno";
	break;
	default:
	nombreDelMes = "no existe ese mes";
	}
	
	System.out.println("Mes " + mes + ": " + nombreDelMes);
  
  }
}
