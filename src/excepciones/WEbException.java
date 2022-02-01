/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Nahue
 */
public class WEbException extends Exception {
  
    public WEbException(String mensaje) {
        super(mensaje);
    }
    
    public WEbException(String mensaje, Throwable e) {
        super(mensaje, e);
    }
}
