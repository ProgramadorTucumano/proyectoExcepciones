package excepciones;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
try {} intenta realizar una tarea
catch {} si la tarea genera una excepción la atrapa y permite continuar el programa

Exception    super clase de la cual heredan todos los eventos excepcionales que pueden
ser atrapados por el programador

throws se usa en la declaración de los metodos de una clase[despues de los parentesis y antes de las llaves]
indica las excepciones que puede lanzar el método al ejecutarse, y si se trata de excepciones marcadas,
cada vez que se llame dicho método se pedirá que se capture dicha excepción

throw se usa para lanzar una excepción

¡Cuál es la diferencia entre Excepciones marcadas y las no marcadas?

Todas las excepciones que descienden de Excepcion son marcadas, excepto
RuntimeException y las que heredan de esta, ¿Pero qué significa esto?
Esto significa que cuando estemos codeando si decimos que un método lanzara una excepción marcada,
cada vez que lo llamamos tendremos que atrapar la excepción con un try {} catch {}, en cambio con
las excepciones no marcadas esto nos pasará, podremos poner que un método lanza una excepción no maracada
y no necesitaremos escribir un try {} catch{}

Se dice que son marcadas cuando la excepción no se produce por culpa del programador, en cambio
no las no marcadas son culpa del programador que no tuvo en cuenta dicha posibilidad

finally {} es opcional, se usa despues del catch{}, es un bloque que se ejecuta si o si,
no importa si se lanza o no la excepción

Exception e;
e.getMessage()  trae el mensaje de la excepción, se puede colocar dentro de un System.out.println();
e.printStackTrace() imprime en pantalla la pila de llamadas de métodos de la excepción

*/

public class Excepciones {

    public static void main(String[] args) throws ArithmeticException, WEbException, Exception {
        Exception er = null;
        try {
            
            System.out.println(unMetodoIntermedio());
        } catch (Exception e) {
            System.out.println("e.getClass().getSimpleName(): "+e.getClass().getSimpleName());
            System.out.println("e.getMessage()"+e.getMessage());
            e.printStackTrace();
        } 

    }
    
    public static Integer unMetodoIntermedio() throws Exception  {
        return excepcion();
    }
    // throws --> lanza
    
    // throw --> lanzar
    public static Integer excepcion() throws ArithmeticException, WEbException {
        Integer numero = 0;
            System.out.println("Hola");
            Integer numerIngresadoPorElUsusario = 0;
//            numero = 10/0;
            Integer.parseInt("hola");
            
            return numero;
        
        //finally {
//            System.out.println(" dentro del finally");
//            numero = 20;
//        }
    }
//    public static void excepcion2() {
//        BufferedImage imagen = ImageIO.read(new File("src/unaImagenCualquiera.jpg"));
//    }
    
}
