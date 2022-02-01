
package excepciones;
/* @author Nahue
 */
public class ClaseException extends Exception {

  public ClaseException(String string) {
    super(string);
  }

  public ClaseException(String string, Throwable thrwbl) {
    super(string, thrwbl);
  }

}
