package Taller13.Ejemplos.ejemplo2;

public class PruebaVehiculo {
    public static void main(String[] args) {
        //Se crea una instancia de la clase que implementa la interfaz
        Coche miCoche = new Coche();

        //Se llama al metodo default heredado de la interfaz
        miCoche.encender();

        //Se llama al metodo implementado en la clase Coche
        miCoche.acelerar();
    }
}