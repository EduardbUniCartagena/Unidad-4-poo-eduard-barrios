package Taller1.Ejercicios;

public class Estudiante {

    //Propiedades
    String nombre;
    int edad;
    String curso;

    //Constructor por defecto
    public Estudiante() {
        this.nombre = "Estudiante Genérico";
        this.edad = 0;
        this.curso = "No Asignado";
    }

    //Constructor que acepta nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No Asignado"; // Valor por defecto para el curso
    }

    //Constructor que acepta todos los parámetros y usa this()
    public Estudiante(String nombre, int edad, String curso) {
        //Llama al constructor de dos parámetros de esta misma clase
        this(nombre, edad);
        //Inicializa la propiedad restante
        this.curso = curso;
    }

    //Metodo para mostrar los detalles
    @Override
    public String toString() {
        return "Estudiante {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}