public class Ejercicio3{
  public static void main(String[] args){
    
    int[][] array= new int [4][5];
    int fila , columna;
    
    for(fila=0;fila<4;fila++){
      for(columna=0; columna<5;columna++){
	      array[fila][columna] = (int)(Math.random() * 901)+100;
      }
    }
    
    int sumaFilas ;
    for(fila = 0; fila < 4; fila++) {
      sumaFilas = 0;
      for(columna = 0; columna < 5; columna++) {
      System.out.printf("%7d ", array[fila][columna]);
      sumaFilas += array[fila][columna];
      }
      System.out.printf("%7d\n", sumaFilas);
      }
for(columna = 0; columna < 5; columna++) {
  }
  int sumaColumna;
  int sumaTotal = 0;
  for(columna = 0; columna < 5; columna++) {
  sumaColumna = 0;
  for(fila = 0; fila < 4; fila++) {
  sumaColumna += array[fila][columna];
  }
  sumaTotal += sumaColumna;
  System.out.printf("%7d ", sumaColumna);
  }
  System.out.printf("%7d ", sumaTotal);
  }
}
  