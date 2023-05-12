import java.util.Scanner;

public class Ejercicio2{
  public static void main(String[] args){
    
    int[][] array= new int [4][5];
    int fila , columna;
    
    for(fila=0;fila<4;fila++){
      for(columna=0; columna<5;columna++){
        System.out.print("Introduce un numero entero: ");
        Scanner s = new Scanner(System.in);
	      array[fila][columna] = s.nextInt();
      }
    }
    for(fila=0;fila<4;fila++){
      System.out.print("Fila: " + fila);
      for(columna=0; columna<5;columna++){
        System.out.printf("%5d", array[fila][columna]);
      }
      System.out.println();
    }
  }
}