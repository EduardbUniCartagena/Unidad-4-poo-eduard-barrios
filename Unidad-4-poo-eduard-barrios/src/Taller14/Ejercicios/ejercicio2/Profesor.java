package Taller14.Ejercicios.ejercicio2;

//Clase derivada
public class Profesor extends Persona {
    //Sobrescribe el método del padre
    @Override
    public void presentarse() {
        System.out.println("Soy un profesor.");
    }
}