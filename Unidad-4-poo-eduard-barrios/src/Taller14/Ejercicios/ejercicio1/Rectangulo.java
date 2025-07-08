package Taller14.Ejercicios.ejercicio1;

//Clase derivada
public class Rectangulo extends Figura {
    //Atributos propios
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Sobrescribe el método del padre
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}