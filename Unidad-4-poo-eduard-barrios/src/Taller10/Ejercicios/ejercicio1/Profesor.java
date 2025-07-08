package Taller10.Ejercicios.ejercicio1;

//Clase derivada
public class Profesor extends Persona {
    //Sobrescribe el metodo del padre
    @Override
    public void presentarse() {
        System.out.println("Buenos días, soy el profesor y voy a enseñar.");
    }
}