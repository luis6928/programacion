/**
* Programa que lee la base y la altura 
* para luego calcula el area del triangulo
*
* @author Luis Ponce Garrido
*/
public class AreaTriangulo {
	public static void main(String[] args) {
		String linea;
		System.out.print("Por favor, introduce la base: ");
		linea = System.console().readLine();
		
		String linea2;
		System.out.print("Por favor, introduce la altura: ");
		linea2 = System.console().readLine();
	
		double base;
		base = Double.parseDouble( linea );
		
		double altura;
		altura = Double.parseDouble( linea2 );
		
		double area;
		area =  (base * altura)/2;
				
		System.out.println("El área es= "+area);
		}
}

