package Taller9.Ejemplos.ejemplo2;

public class Coche extends Vehiculo {
    private int numeroDePuertas;
    public Coche(String marca, int numeroDePuertas) {
        super(marca); // Llama al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }
}