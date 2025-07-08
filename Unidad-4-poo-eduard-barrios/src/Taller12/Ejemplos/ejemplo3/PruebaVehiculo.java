package Taller12.Ejemplos.ejemplo3;

public class PruebaVehiculo {
    public static void main(String[] args) {
        //Se crea una instancia de Coche
        Coche miCoche = new Coche();

        //Llamando al metodo heredado directamente de la interfaz
        miCoche.encender();

        //Llamando al metodo implementado en la clase Coche
        miCoche.acelerar();
    }
}