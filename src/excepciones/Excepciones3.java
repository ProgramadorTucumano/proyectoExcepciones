package excepciones;

import ClaseRepaso.WebException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Nahue
 */
public class Excepciones3 {

  public static void main(String[] args) {
    try {
      System.out.println("Usando throws y throw");
      primerMetodo();
      otroError();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("MEnsaje del error: " + e.getMessage());
    }
    String hola ="hola";

  }

  public static void primerMetodo() throws Exception {
    List<String> palabras = null;
    try {
     segundoMetodo();
    otroError();
    } catch (PalabrasNulaExcepcion e) {
      throw new Exception("Estamos sobreescribiendo la excepcion PalabrasNulaExcepcion",e);
    } catch (Exception e) {
      throw new Exception("Estamos sobreescribiendo la anterior excepcion", e);
    } finally {
      System.out.println("Se muestra el mensaje si se lanza una excepcion antes? solo si esta dentro de una finally");
    }
    System.out.println("Se muestra el mensaje si se lanza una excepcion antes?");
    

  }

  public static void segundoMetodo() throws PalabrasNulaExcepcion {
    List<String> palabras = null;
    if (palabras == null) {
      throw new PalabrasNulaExcepcion("Ocurrio un error en el segundo metodo");
    }
  }

  public static void otroError() throws WebException   {
    List<String> palabras = null;
    if (palabras == null) {
      throw new WebException("Ocurrio otro Error");
    }
    
  }

}
