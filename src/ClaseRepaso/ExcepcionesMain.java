/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseRepaso;

import excepciones.WEbException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Nahue
 */
public class ExcepcionesMain {

  public static void main(String[] args) {
    try {
      primerMetodo();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("Lanzamos otra excepcion");
      e.printStackTrace();
    }

  }

  public static void primerMetodo() throws WEbException {

    segundoMetodo();

  }

  public static void segundoMetodo() throws WEbException {

    Integer numero = Integer.parseInt("w");
    tercerMetodo();

  }

  public static void tercerMetodo() throws NumberFormatException, WEbException {
    if (1 > 0) {
      throw new WEbException("No aceptamos a los unos mayores que ceros somos anti matematicas");
    }
  }
}
