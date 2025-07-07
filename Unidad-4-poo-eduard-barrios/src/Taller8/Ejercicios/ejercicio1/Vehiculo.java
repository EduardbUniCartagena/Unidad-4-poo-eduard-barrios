package Taller8.Ejercicios.ejercicio1;

public class Vehiculo {
    //Atributos
    protected String marca;
    protected double velocidadMaxima;

    //Constructor
    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo para mostrar información
    public void mostrarInfoVehiculo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidad Máxima: " + this.velocidadMaxima + " km/h");
    }
}