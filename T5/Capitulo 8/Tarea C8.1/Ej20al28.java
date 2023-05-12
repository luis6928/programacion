public class Ej20al28 {

public static int[] generaArrayInt(int n, int max, int min) {
  int[] x = new int[n]; //Se crea el array con n espacios
  for(int i = 0; i < n; i++) {
  x[i] = (int)(Math.random()*(max - min + 1) + min); //Se rellenan los espacios con un numero aleatorio entre los numeros max y min
  }
  return x; //Se devuelve x  

  }
  public static int minimoArrayInt(int[] x) {
    int min = Integer.MAX_VALUE; //Se le da a la variable min el valor mas grande
    for (int n : x) {
      if (n < min) { //Si n es menor que min entonces min pasa a ser = n
        min = n;
      }
    }
    return min; //Se devuelve min 
  }

  public static int maximoArrayInt(int[] x) {
    int max = Integer.MIN_VALUE; //se da a max el valor mas pequeño
    for (int n : x) {
    if (n > max) { //Si n es mayor que max entonces max pasa a ser = n
    max = n;
    }
    }
    return max; //se devuelve max
    }
    

  public static double mediaArrayInt(int[] x) {
    int suma = 0;
    for (int n : x) { 
      suma += n;    
    }
    return (double)suma / x.length;
      }
    
    public static boolean estaEnArrayInt(int[] x, int n) {
      for (int i : x) {
        if (i == n) { //si i es equivalente a n devuelve verdadero y si no devuelve falso
          return true;
        }
      }
      return false;
    }

  public static int posicionEnArrayInt(int[] x, int n) {
    for(int i = 0; i < x.length; i++) {
      if (x[i] == n) { //si la posicion i del array x es equivalente a n devuelve i, si no devuelve -1
      return i;
      }
    }
    return -1;
  }

  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];
      for(int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
    return a;
  }

  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    int[] a = x.clone(); 
    int i;
    int aux;
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
    return a;
  }

  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
    return a;
}


}