package Taller14.Ejercicios.ejercicio4;

//Clase derivada
public class Coche extends Vehiculo {
    //Sobrescribe el método del padre
    @Override
    public void mover() { //
        System.out.println("El coche avanza por la carretera.");
    }
}