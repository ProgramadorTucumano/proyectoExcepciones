/*
NullPointerException ocurre cuando se usa una variable que referencia a un objeto pero que el
contenido de la variable es null, sin valor o sin contener una referencia a un objeto,
lo que causa que llamar al método no sea posible

 */
package NullPointerExcepcion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nahue
 */
public class mainNullPointerException {
//    public static void main(String[] args) {
//        Humano humano = null;
//        System.out.println("edad humano: "+humano.getEdad());
//    }
    
    public static void main(String[] args) {
        try {
            Humano humano = null;
            System.out.println("edad humano: "+humano.getEdad());
        }  catch (NullPointerException e) {
          e.printStackTrace();
            System.out.println("NullPointerException ocurre cuando se usa\n"
                    + " una variable que referencia a un objeto pero que el\n"
                    + " contenido de la variable es null, sin valor o sin contener\n"
                    + " una referencia a un objeto, lo que causa que llamar al método \n"
                    + " no sea posible");
        } catch (Exception e) {
            System.out.println("Exception general");
        }
    }
}

