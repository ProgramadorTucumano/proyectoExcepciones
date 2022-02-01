/*
Se lanza para indicar que el código ha intentado convertir un objeto 
en una subclase de la que no es una instancia.
 */
package ClassCastException;

import java.util.ArrayList;
import java.util.List;

/* @author Nahue
 */
public class mainClassCastException {

  public static void main(String args[]) {
    Hijo hijo1 = new Hijo("Javier");
    SuperClase super1 = new SuperClase("Jeremias");
    hijo1.imprimirNombre();
    super1.imprimirNombre();
    Hijo hijo2 = (Hijo) super1;
    hijo2.imprimirNombre();

  }

}

class SuperClase {

  String nombre;

  SuperClase(String nombre) {
    this.nombre = nombre;
  }

  public void imprimirNombre() {
    System.out.println(nombre);
  }
}

class Hijo extends SuperClase {

  String nombreHijo;

  Hijo(String nombre) {
    super(nombre);
    this.nombreHijo = nombre;
  }

  @Override
  public void imprimirNombre() {
    System.out.println(nombreHijo);
  }
}
