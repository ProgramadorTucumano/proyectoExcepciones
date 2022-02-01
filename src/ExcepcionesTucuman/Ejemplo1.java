package ExcepcionesTucuman;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Nahue
 */
public class Ejemplo1 {
  
  public static Scanner pepe = new Scanner(System.in).useDelimiter("\n");
          
          
    public static void main(String[] args)  {
      
      try {
        System.out.println("Ingrese un divisor");
        Integer numero = pepe.nextInt();
        // vamos intentar ejecutar código
        Integer resultado = 10 / numero;
        ingresarUnNumero();
      } catch (ArithmeticException pepita) {
         // vamos a decir que sucede en el caso de que se lance una excepción
        System.out.println("No se puede dividir por 0 lo siento");
        
      } catch (Exception epepita3) {
        // vamos a decir que sucede en el caso de que se lance una excepción
        System.out.println("El mensaje del error es: "+epepita3.getMessage());
        epepita3.printStackTrace();
        
      }
        
      
      
      System.out.println("Ingrese un nuevo divisor");
        
    }
    
    public static void ingresarUnNumero() throws Exception   {
      try {
        
        System.out.println("Ingrese la cantidad de numeros");
        Integer cantidad = pepe.nextInt();

        Integer[] numeros = new Integer[cantidad];

        for (int i = 0; i < 10; i++) {
          System.out.println("ingrese un numero");
          numeros[i] = pepe.nextInt();
        }
        
      } catch (Exception e) {
        
        throw new Exception("Superó el limite del tamaño del arrreglo",e);
      } finally {
        System.out.println("Hola");
      }
      
      
      
    }
}
