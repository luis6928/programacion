public class Ejercicio13 {
  public static void main(String[] args) {
    
    String[] pais = {"España", "Rusia", "Japón", "Australia"};
    int[][] estaturas = new int[4][10];
    
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        estaturas[i][j] = (int) (Math.random() * (210 - 140 + 1)) + 140;
      }
    }
    System.out.printf("%64s\n", "MED MIN MAX");
    for (int i = 0; i < 4; i++) {
      int max = 140;
      int min = 210;
      int suma = 0;
      System.out.printf("%9s:", pais[i]);
      for (int estatura : estaturas[i]) {
        System.out.printf("%4d", estatura);
        max = estatura > max ? estatura : max;
        min = estatura < min ? estatura : min;
        suma += estatura;
      }
    System.out.printf(" |%4d%4d%4d\n", suma / 10, min, max);
    }
  }
}