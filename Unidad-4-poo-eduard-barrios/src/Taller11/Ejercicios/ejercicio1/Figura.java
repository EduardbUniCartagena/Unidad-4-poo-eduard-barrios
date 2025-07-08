package Taller11.Ejercicios.ejercicio1;

//Clase abstracta
public abstract class Figura {
    //Metodo abstracto que las subclases deben implementar
    public abstract double calcularArea();

    //Metodo concreto que usa el metodo abstracto
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + this.calcularArea());
    }
}