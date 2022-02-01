
package excepciones;
/* @author Nahue
 */
public class PalabrasNulaExcepcion extends Exception{

  public PalabrasNulaExcepcion(String mensaje) {
    super(mensaje);
  }

  public PalabrasNulaExcepcion(String mensaje, Throwable otroError) {
    super(mensaje, otroError);
  }
 
}
