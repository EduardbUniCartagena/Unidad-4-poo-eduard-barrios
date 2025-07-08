package Taller11.Ejemplos.ejemplo1;

// Clase abstracta
public abstract class Empleado {
    protected String nombre;
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract void calcularSalario(); // Metodo abstracto
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
