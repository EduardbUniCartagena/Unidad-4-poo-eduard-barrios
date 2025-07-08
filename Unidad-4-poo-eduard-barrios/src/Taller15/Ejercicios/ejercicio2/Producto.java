package Taller15.Ejercicios.ejercicio2;

//1. Clase solo para los datos del producto
public class Producto {
    //Atributos
    private String nombre;
    private double precioBase;

    //Constructor
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }
}