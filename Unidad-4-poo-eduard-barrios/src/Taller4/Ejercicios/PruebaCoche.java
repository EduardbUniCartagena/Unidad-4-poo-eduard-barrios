package Taller4.Ejercicios;

public class PruebaCoche {
    public static void main(String[] args) {
        //Se crea una instancia de Coche
        Coche miCoche = new Coche("Nissan", "Versa", 180);

        //Se accede a los datos de forma correcta usando getters
        System.out.println("Coche: " + miCoche.getMarca() + " " + miCoche.getModelo());

        // --- Observando los errores de compilación ---
        // Para observar los errores, descomente la siguiente seccion.

        /*
        // Intento de leer un atributo privado directamente (ERROR)
        System.out.println(miCoche.marca);

        // Intento de modificar un atributo privado directamente (ERROR)
        miCoche.velocidadMaxima = 200;
        */
    }
}