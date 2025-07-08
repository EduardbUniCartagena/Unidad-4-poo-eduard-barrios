package Taller13.Ejemplos.ejemplo1;

// Clase derivada
public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}