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
public class CodigoDecero {
    public static void main(String[] args) {
        try {
            metodoCualquiera();
        } catch (Exception e) {
            System.out.println("main: "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void metodoCualquiera() throws WEbException {
        try {
            System.out.println("dentro try");
            Integer.parseInt("hola");
        } catch (Exception e) {
            System.out.println("dentro del catch");
            
        } finally {
            System.out.println("dentro finally");
        }
        System.out.println("despues del catch");
    }
}
