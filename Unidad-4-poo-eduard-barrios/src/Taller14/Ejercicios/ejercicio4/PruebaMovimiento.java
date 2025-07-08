package Taller14.Ejercicios.ejercicio4;

public class PruebaMovimiento {
    public static void main(String[] args) {
        //Se usan referencias de la clase base para apuntar a objetos de las subclases
        Vehiculo miVehiculo1 = new Coche(); //
        Vehiculo miVehiculo2 = new Bicicleta(); //

        //Se demuestra el polimorfismo
        miVehiculo1.mover(); //Llama al metodo de Coche
        miVehiculo2.mover(); //Llama al metodo de Bicicleta
    }
}