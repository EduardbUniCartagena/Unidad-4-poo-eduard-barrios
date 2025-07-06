package Taller3.Ejercicios;

public class Matematicas {

    //Constructor privado para evitar que se creen instancias de esta clase.
    private Matematicas() {
    }

    //Metodo estático para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    //Metodo estático para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    //Metodo estático para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    //Metodo estático para dividir
    public static double dividir(double a, double b) {
        //Se añade una validación para evitar la división por cero
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }
}