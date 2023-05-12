public class Ej1al6 {

  public static boolean esCapicua(long a) {
    if (a == voltea(a)){
    return a ;
    }
  }

  public static Boolean esPrimo(long a) {
    if (a < 2) {
      return false;
    } else {
        for (long i = a / 2; i >= 2; i--) {
          if (a % i == 0) {
            return false;
          }
        }
    }
    return true;
  }

  public static int siguientePrimo(int a) {
    while (!esPrimo(++a)) {};
    return a;
  }

  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
    return 1;
    }
    if (exponente < 0) {
    return 1/potencia(base, -exponente);
    }
    int a = 1;
    for (int i = 0; i < Math.abs(exponente); i++) {
    a = a * base;
    }
    return a;
    }

  public static int digitos(long a) {
    if (a < 0) {
      a = -a;
    }
    if (a == 0) {
      return 1;
    } else {
      int n = 0;
      while (a > 0) {
        a = a / 10; 
        n++; 
      }
    return n;
    }
  }

  public static long voltea(long a) {
    if (a < 0) {
      return -voltea(-a);
    }
    long volteado = 0;
    while(a > 0) {
      volteado = (volteado * 10) + (a % 10);
      a = a / 10;
    }
      return volteado;
    }
}