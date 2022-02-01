/*Se lanza cuando se intenta acceder a una constante de enumeración por nombre y 
la enumeración no contiene ninguna constante con dicho nombre.
 */
package EnumConstantNotPresentException;

/* @author Nahue
 */
public class mainEnumConstantNotPresentException {

  public static void main(String[] args) {
    System.out.println(unEnum.valueOf("CHAUO"));
    System.out.println(unEnum.HOLA);
  }
}
