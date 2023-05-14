public class Gato {
  private String nombre;
  private String peso;
  private String raza;
  
  public Gato(String nombre, String peso, String raza) {
    this.nombre = nombre;
    this.peso = peso;
    this.raza = raza;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getPeso() {
    return peso;
  }

  public void setPeso(String peso) {
    this.peso = peso;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
}