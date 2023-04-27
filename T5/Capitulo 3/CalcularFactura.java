/**
* Programa que calcula el total de una factura
* a partir de la base imponible
*
* @author Luis Ponce Garrido
*/
public class CalcularFactura {
	public static void main(String[] args) {
		String linea;
		System.out.print("Por favor, introduce la base imponible: ");
		linea = System.console().readLine();
	
		double baseImponible;
		baseImponible = Double.parseDouble( linea );
		
		
		double total;
		total =  (baseImponible * 1.21);
				
		System.out.println("El precio total es= "+total);
		}
}

