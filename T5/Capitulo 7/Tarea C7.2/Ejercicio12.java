public class Ejercicio12 {
  public static void main(String[] args) {
    int[][] n = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        n[i][j] = (int) (Math.random() * 401) + 500;
        System.out.printf("%5d", n[i][j]);
      } 
    System.out.println();
    }
    
    System.out.print("\nDiagonal desde la esquina inferior izquierda ");
    System.out.println("a la esquina superior derecha: ");
    
    int max = 500;
    int min = 900;
    int suma = 0;
    
    for (int i = 0; i < 9; i++) {
      int num = n[8 - i][i];
      System.out.print(num + " ");
        if (num > max) {
          max = num;
        }
        if (num < min) {
          min = num;
        }
      suma += num;
      }
      
      System.out.println("\nMáximo: " + max);
      System.out.println("Mínimo: " + min);
      System.out.println("Media: " + ((double) suma / 10));
  }
}
      