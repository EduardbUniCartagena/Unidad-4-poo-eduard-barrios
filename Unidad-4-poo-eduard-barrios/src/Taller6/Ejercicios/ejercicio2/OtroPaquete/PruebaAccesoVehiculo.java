package Taller6.Ejercicios.ejercicio2.OtroPaquete;
import Taller6.Ejercicios.ejercicio2.Moto;

public class PruebaAccesoVehiculo {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Yamaha", 600);

        // --- Observando el error ---
        /* La siguiente línea dará un error de compilación si la descomentas
         porque 'marca' es 'protected' en Vehiculo y esta clase no hereda
         de Vehiculo ni está en el mismo paquete.*/

        //System.out.println("Marca: " + miMoto.marca);
    }
}