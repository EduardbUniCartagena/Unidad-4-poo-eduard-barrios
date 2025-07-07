package Taller8.Ejercicios.ejercicio1;

public class PruebaVehiculo {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Coche miCoche = new Coche("Toyota", 220, 4);

        //Se llama al metodo que muestra toda la información
        miCoche.mostrarInfoCoche();
    }
}