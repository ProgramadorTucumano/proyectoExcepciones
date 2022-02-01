/*
Esto se lanza para indicar que la aplicación ha intentado convertir una cadena
a uno de los tipos numéricos, pero que la cadena no tiene el formato adecuado.
 */
package NumberFormatException;

import java.util.Scanner;

/**
 *
 * @author Nahue
 */
public class mainNumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
         String cadena1 = sc.next();
         Integer.parseInt(cadena1);
    }
}
