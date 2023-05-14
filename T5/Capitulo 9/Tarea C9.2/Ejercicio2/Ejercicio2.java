public class Ejercicio2 {
  public static void main(String[] args) {
    Gato[] array = new Gato[4];
    
    array[0] = new Gato("Neko", "5", "persa");
    array[1] = new Gato("Rengar", "70", "persa");
    array[2] = new Gato("Yuumi", "7", "persa");
    array[3] = new Gato("Tupac", "4", "persa");
    
    System.out.println("Datos de los gatos: ");
    
    for (int i = 0; i < 4; i++) {
      System.out.println("Gato " + i);
      System.out.println("Nombre: " + array[i].getNombre());
      System.out.println("Peso: " + array[i].getPeso()+" kg");
      System.out.println("Raza: " + array[i].getRaza());
    }
  }
}