/*
Significa que la clase no tiene un campo con un nombre específico.
Parecido a NoSuchMethodException que se lanza cuando no se puede encontrar el método que se está llamando.
 */
package NoSuchFieldException;
/*@author Nahue
 */
public class mainNoSuchFieldException {
    public static void main(String[] args) {
        Persona p1 = new Persona("Tomas");
        Persona p2 = new Persona("Lucas");
        System.out.println(p1.getNombre());
        System.out.println(p2.getNombre());
        String hola = "hola";
//        System.out.println(p1.getApellido());
//        System.out.println(p2.getApellido());
    }
    
    public static class Persona {
        String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
