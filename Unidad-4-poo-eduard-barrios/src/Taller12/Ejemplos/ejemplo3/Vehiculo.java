package Taller12.Ejemplos.ejemplo3;

// Interfaz Vehiculo con un metodo abstracto y un metodo predeterminado
public interface Vehiculo {
    void acelerar();
    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
