package Taller6.Ejercicios.ejercicio1;


public class Empleado {
    //Propiedades protegidas para que las subclases puedan acceder a ellas
    protected String nombre; //
    protected double salario; //

    //Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Método protegido
    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}