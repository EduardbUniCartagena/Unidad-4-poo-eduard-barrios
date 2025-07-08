package Taller13.Ejemplos.ejemplo2;

// Definición de una interfaz
public interface Vehiculo {
    void acelerar();
    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
