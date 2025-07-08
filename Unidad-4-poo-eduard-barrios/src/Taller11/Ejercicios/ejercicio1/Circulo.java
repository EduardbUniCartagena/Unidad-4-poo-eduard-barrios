package Taller11.Ejercicios.ejercicio1;

//Clase concreta que hereda de Figura
public class Circulo extends Figura {
    //Atributo propio
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Implementación del método abstracto
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}