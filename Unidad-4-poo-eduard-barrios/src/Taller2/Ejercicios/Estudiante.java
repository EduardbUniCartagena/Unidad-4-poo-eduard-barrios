package Taller2.Ejercicios;

public class Estudiante {

    //Atributos de la clase
    String nombre;
    int edad;

    //Constructor por defecto que llama al otro constructor
    public Estudiante() {
        //Llama al constructor de dos parámetros con valores por defecto
        this("Estudiante Desconocido", 0);
    }

    //Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo que imprime los detalles del estudiante
    public void imprimirDetalles() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
}