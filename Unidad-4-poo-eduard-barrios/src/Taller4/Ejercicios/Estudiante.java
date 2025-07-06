package Taller4.Ejercicios;

public class Estudiante {
    //Propiedades privadas
    private String nombre;
    private int edad;
    private double notaPromedio;

    //Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.setEdad(edad);
        this.setNotaPromedio(notaPromedio);
    }

    //Getter para nombre
    public String getNombre() {
        return nombre;
    }

    //Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter para edad
    public int getEdad() {
        return edad;
    }

    //Setter para edad con validación
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser un número positivo.");
        }
    }

    //Getter para notaPromedio
    public double getNotaPromedio() {
        return notaPromedio;
    }

    //Setter para notaPromedio con validación
    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) { //Asumiendo una escala de 0 a 5
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 0.0 y 5.0.");
        }
    }
}