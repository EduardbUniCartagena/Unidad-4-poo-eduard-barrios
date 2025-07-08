package Taller11.Ejercicios.ejercicio2;

//Clase concreta
public class Gerente extends Empleado {
    //Atributos propios
    private double salarioBase;
    private double bono;

    //Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    //Implementación del metodo abstracto
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}