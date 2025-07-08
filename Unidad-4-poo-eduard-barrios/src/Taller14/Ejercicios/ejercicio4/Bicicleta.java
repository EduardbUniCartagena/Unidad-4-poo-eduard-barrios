package Taller14.Ejercicios.ejercicio4;

//Clase derivada
public class Bicicleta extends Vehiculo {
    //Sobrescribe el método del padre
    @Override
    public void mover() { //
        System.out.println("La bicicleta pedalea por el sendero.");
    }
}