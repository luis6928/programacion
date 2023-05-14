public class Ejercicio11 {
  public static void main(String[] args) {
    int[][] n = new int[10][10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        n[i][j] = (int)(Math.random()*101) + 200;
        System.out.printf("%5d", n[i][j]);
      }
      System.out.println();
    }
    System.out.print("\nDiagonal desde la esquina superior izquierda ");
    System.out.println("a la esquina inferior derecha: ");
    
    int max = 200;
    int min = 300;
    int suma = 0;
    
    for(int i = 0; i < 10; i++) {
      int num = n[i][i];
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
    System.out.println("Media: " + ((double)suma / 10));
  }
}