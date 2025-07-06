package Taller4.Ejercicios;

public class PruebaEstudiante {
    public static void main(String[] args) {
        //Se crea una instancia de Estudiante
        Estudiante estudiante1 = new Estudiante("Carlos", 20, 4.5);
        System.out.println("Estudiante: " + estudiante1.getNombre() + ", Nota: " + estudiante1.getNotaPromedio());

        //Se intenta actualizar con una nota inválida
        System.out.println("\nIntentando poner una nota de 6.0...");
        estudiante1.setNotaPromedio(6.0);
        System.out.println("Nota actual: " + estudiante1.getNotaPromedio()); //La nota no debería cambiar

        //Se actualiza con una nota válida
        System.out.println("\nIntentando poner una nota de 3.5...");
        estudiante1.setNotaPromedio(3.5);
        System.out.println("Nota final: " + estudiante1.getNotaPromedio());
    }
}