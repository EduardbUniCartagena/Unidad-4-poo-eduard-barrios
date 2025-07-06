package Taller4.Ejercicios;

public class Coche {
    //Todas las propiedades son privadas
    private String marca; //
    private String modelo; //
    private double velocidadMaxima; //

    //Constructor
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Método para acelerar con validación
    public void acelerar(double incremento) { //
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
        }
    }

    //Getters para poder leer los valores de forma controlada
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}