package Taller10.Ejercicios.ejercicio1;

//Clase derivada
public class Estudiante extends Persona {
    //Sobrescribe el metodo del padre
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante y estoy aprendiendo.");
    }
}