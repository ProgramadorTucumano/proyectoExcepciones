/*
Lanzado por un Scanner cuando el dato recuperado no coincide con el tipo esperado.
 */
package InputMisMatchException;
import java.util.Scanner;
/* @author Nahue
 */
public class mainInputMisMatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        do {        
            Integer num1;
//            try {
             num1 = sc.nextInt();
//            } catch (Exception e) {
//                System.out.println("Ingresaste una palabra, ingresa un numero por favor");
//                sc.close();
//            }
        } while (true);
        
        
    }
}
