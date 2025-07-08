package Taller11.Ejercicios.ejercicio2;

//Clase abstracta
public abstract class Empleado {
    //Atributo
    protected String nombre;

    //Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //Metodo abstracto
    public abstract double calcularSalario();

    //Metodo concreto
    public void mostrarDetalles() {
        System.out.println("Empleado: " + this.nombre);
        System.out.println("Salario calculado: $" + this.calcularSalario());
    }
}