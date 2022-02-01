package excepciones;

import java.util.List;
import java.util.Scanner;

/* @author Nahue
 */
public class Excepciones2 {

  private static Scanner pepe = new Scanner(System.in).useDelimiter("\n");

  public static void main(String[] args) {
    boolean inputCorrecto = true;
    String nombre = "";
    int edad = 0;
    do {
      System.out.println("Ingrese el nombre");
      nombre = pepe.next();
      do {
        try {
          System.out.println("Ingrese su edad");
          edad = pepe.nextInt();
          inputCorrecto = true;
        } catch (Exception e) {
          System.out.println("Ingreso una palabra, por favor ingrese un numero");
          inputCorrecto = false;
          pepe.next();
        }
      } while (!inputCorrecto);
    } while (!inputCorrecto);
    System.out.println("nombre: " + nombre + " edad: " + edad);

  }

  public static void traerElemento0(List<String> palabras) {
    System.out.println("elemento 1: " + palabras.get(0));
  }
}

// pepe espera el input
// el usuario ingresa un input incorrecto
// ocurre un error y pepe no lo puede leer
//entra dentro del catch
// sale del catch
// pepe vuelve a esperar un input
//


