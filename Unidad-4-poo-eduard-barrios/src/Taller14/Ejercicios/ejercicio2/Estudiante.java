package Taller14.Ejercicios.ejercicio2;

//Clase derivada
public class Estudiante extends Persona {
    //Sobrescribe el metodo del padre
    @Override
    public void presentarse() {
        System.out.println("Soy un estudiante.");
    }
}