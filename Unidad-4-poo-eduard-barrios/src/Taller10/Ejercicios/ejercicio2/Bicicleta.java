package Taller10.Ejercicios.ejercicio2;

//Clase derivada
public class Bicicleta extends Vehiculo {
    //Sobrescribe el metodo del padre
    @Override
    public void moverse() {
        System.out.println("La bicicleta está pedaleando por el camino.");
    }
}