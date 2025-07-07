package Taller8.Ejercicios.ejercicio3;

public class Empleado {
    //Atributos
    protected String nombre;
    protected double salario;

    //Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario: $" + this.salario);
    }
}