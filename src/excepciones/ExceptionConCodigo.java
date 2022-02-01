
package excepciones;
/* @author Nahue
 */
public class ExceptionConCodigo extends Exception {

  private int codigoError;

  public ExceptionConCodigo(String mensaje, int codigo) {
    super(mensaje);
    codigoError = codigo;
  }

  public ExceptionConCodigo(String mensaje, Throwable e, int codigo) {
    super(mensaje, e);
    codigoError = codigo;
  }

  public int getCodigo() {
    return codigoError;
  }
}
