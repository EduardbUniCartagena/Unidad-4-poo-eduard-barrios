package Taller14.Ejemplos.ejemplo2;

// Clase de prueba (incorrecta)
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        // la siguiente linea dará error de compilación
        //miAnimal.correr();
        // Error de compilación: El metodo correr() no existe en Animal
    }
}
