package Taller11.Ejercicios.ejercicio2;

//Clase concreta
public class Vendedor extends Empleado {
    //Atributos propios
    private double salarioBase;
    private double comision;

    //Constructor
    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    //Implementación del metodo abstracto
    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}