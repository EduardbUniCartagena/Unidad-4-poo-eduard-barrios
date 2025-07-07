package Taller7.Ejercicios.ejercicio1;

public class Empleado {
    //Propiedad pública
    public String nombre; //

    //Propiedad privada
    private double salario;

    //Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.setSalario(salario);
    }

    //Getter público para salario
    public double getSalario() { //
        return this.salario;
    }

    //Setter público para salario con validación
    public void setSalario(double salario) { //
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }
}