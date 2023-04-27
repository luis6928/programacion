/**
* Cuestionario de matematicas que muestra la puntuacion obtenida al final
* 
* (Lo he hecho de matematicas y no de preguntas relacionadas a DAW porque me parecia mas sencillo de elaborar pero el codigo seria el mismo)
* 
*
* @author Luis Ponce Garrido
*/
public class Ejercicio12 {

  public static void main(String[] args) {
		int puntos = 0;
    String respuesta;
    
    System.out.println("Cuestinario de matematicas");
    
    System.out.println("1. ¿Cual es el resultado de 55+38?");
    System.out.println("a) 93 b) 73 c) 87"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Acertaste");
    } else {
      System.out.println("Fallaste");
    }

    System.out.println("2. ¿Cual es el resultado de 4*30");
    System.out.println("a) 130 b) 160 c) 120"); 
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Acertaste");
    } else {
      System.out.println("Fallaste");
    }

    System.out.println("3. ¿Cual es el valor de x en : x+3=3?");
    System.out.println("a) 1 b) 0 c) 2"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Acertaste");
    } else {
      System.out.println("Fallaste");
    }
    
    System.out.println("4. ¿Cuanto es 21/3?");
    System.out.println("a) 7 b) 9 c) 6"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Acertaste");
    } else {
      System.out.println("Fallaste");
    }

    System.out.println("Ha obtenido " + puntos + " puntos.");
  }
}
