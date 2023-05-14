public class Ejercicio5 {
  public static void main(String[] args){
    
    int[][] array = new int[6][10];
    int fila;
    int columna;
    int min = Integer.MAX_VALUE;
    int filaMin = 0;
    int columnaMin = 0;
    int max = Integer.MIN_VALUE;
    int filaMax = 0;
    int columnaMax = 0;

    for(columna = 0; columna < 10; columna++) {
      System.out.print(" " + columna + " ");
    }
    System.out.println();
    System.out.print(" ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print(" " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        array[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%5d ", array[fila][columna]);
          
          if (array[fila][columna] < min) {
            min = array[fila][columna];
            filaMin = fila;
            columnaMin = columna;
          }

          if (array[fila][columna] > max) {
            max = array[fila][columna];
            filaMax = fila;
            columnaMax = columna;
          }
      }
      System.out.println("│");
    }
    System.out.print(" └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┘\n El máximo es " + max + " de la fila " + filaMax + ",\
    columna " + columnaMax);
    
    System.out.println("El mínimo es " + min + " de la fila " + filaMin + ", colu\
    mna " + columnaMin);
  }
}
