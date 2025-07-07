package Taller5.Ejercicios;

public class Persona {
    //Atributo privado
    private String nombre;

    //Atributo con acceso de paquete (default)
    int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter público para el atributo privado
    public String getNombre() {
        return nombre;
    }

    //Setter público para el atributo privado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}