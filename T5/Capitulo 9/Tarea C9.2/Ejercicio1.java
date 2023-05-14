public class Ejercicio1 {
  public static void main(String[] args) {
    Gato[] array = new Gato[4];
    int i;
    System.out.println("Introduce los datos: ");
    
    for (i = 0; i < 4; i++) {
      array[i] = new Gato();
      System.out.println("Gato  " + i);
      System.out.print("Nombre: ");
      array[i].setNombre(System.console().readLine());
      System.out.print("Peso: ");
      array[i].setPeso(System.console().readLine());
      System.out.print("Raza: ");
      array[i].setRaza(System.console().readLine());
    }
    System.out.println("Datos de los gatos: ");
    
    for (i = 0; i < 4; i++) {
      System.out.println("Gato nº" + i);
      System.out.println("Nombre: " + array[i].getNombre());
      System.out.println("Peso: " + array[i].getPeso()+" kg");
      System.out.println("Raza: " + array[i].getRaza());
    }
  }
}