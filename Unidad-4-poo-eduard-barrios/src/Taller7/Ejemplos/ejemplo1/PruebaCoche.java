package Taller7.Ejemplos.ejemplo1;

public class PruebaCoche {
    public static void main(String[] args) {
        //Se crea la instancia
        Coche miCoche = new Coche("Audi", 240.0);

        //Se llama al metodo público para mostrar la info
        miCoche.mostrarInformacion();

        //Se usa el metodo público para modificar un atributo
        System.out.println("\nActualizando velocidad...");
        miCoche.setVelocidadMaxima(250.0);

        //Se muestra la información actualizada
        miCoche.mostrarInformacion();
    }
}