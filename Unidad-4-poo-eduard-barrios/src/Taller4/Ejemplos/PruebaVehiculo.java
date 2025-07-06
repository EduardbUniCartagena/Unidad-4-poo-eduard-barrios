package Taller4.Ejemplos;

public class PruebaVehiculo {
    public static void main(String[] args) {
        //Se crea una instancia de Vehiculo
        Vehiculo miAuto = new Vehiculo("Toyota", 60.0);

        //Se muestra la velocidad inicial
        System.out.println("Velocidad inicial: " + miAuto.getVelocidad() + " km/h");

        //Se acelera con un valor válido
        System.out.println("\nAcelerando 20 km/h...");
        miAuto.acelerar(20.0);
        System.out.println("Velocidad actual: " + miAuto.getVelocidad() + " km/h");

    }
}