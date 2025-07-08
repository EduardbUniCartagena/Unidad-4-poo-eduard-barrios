package Taller14.Ejercicios.ejercicio1;

//Clase derivada
public class Circulo extends Figura {
    //Atributo propio
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Sobrescribe el método del padre
    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}