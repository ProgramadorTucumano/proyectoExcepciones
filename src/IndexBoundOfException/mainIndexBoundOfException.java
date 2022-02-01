/*
Cuando se intenta acceder a un elemento de una matriz con un índice que está fuera de rango,
Parecidos a este están: StringIndexOutOfBoundsException, IndexOutOfBoundsException, NegativeArraySizeException
 */
package IndexBoundOfException;

/* @author Nahue
 */
public class mainIndexBoundOfException {

  public static void main(String[] args) {
    String[] cadenas = new String[5];
    for (int i = 0; i < 6; i++) {
      String cadena = cadenas[i];
      System.out.println("cadena: " + cadena);
    }
  }
}
