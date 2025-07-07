package Taller8.Ejercicios.ejercicio2;

public class PruebaEstudiante {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Estudiante estudiante1 = new Estudiante("Mariana", 21, "2024-001");

        //Se llama al metodo sobrescrito que muestra toda la información
        estudiante1.mostrarDetalles();
    }
}
