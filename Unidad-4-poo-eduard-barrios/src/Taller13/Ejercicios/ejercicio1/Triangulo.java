package Taller13.Ejercicios.ejercicio1;

//Clase concreta que hereda de Figura
public class Triangulo extends Figura {
    //Atributos propios
    private double base;
    private double altura;

    //Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Implementación del metodo abstracto
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}