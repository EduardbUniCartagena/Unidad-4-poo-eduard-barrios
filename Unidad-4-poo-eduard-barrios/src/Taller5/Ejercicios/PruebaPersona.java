package Taller5.Ejercicios;

public class PruebaPersona {
    public static void main(String[] args) {
        //Se crea la instancia
        Persona p1 = new Persona("Luisa", 30);

        //--- Acceso al atributo 'nombre' (private) ---
        //System.out.println(p1.nombre); //ERROR: 'nombre' es privado.
        //La forma correcta es a través de sus métodos públicos:
        System.out.println("Acceso correcto a nombre: " + p1.getNombre());

        //--- Acceso al atributo 'edad' (default) ---
        //Como estamos en el mismo paquete, podemos acceder directamente.
        System.out.println("Acceso directo a edad: " + p1.edad);
        p1.edad = 31; //También se puede modificar directamente.
        System.out.println("Edad modificada: " + p1.edad);
    }
}