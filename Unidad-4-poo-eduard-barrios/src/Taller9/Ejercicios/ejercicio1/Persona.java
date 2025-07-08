package Taller9.Ejercicios.ejercicio1;

public class Persona {
    //Atributos
    protected String nombre;
    protected int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}