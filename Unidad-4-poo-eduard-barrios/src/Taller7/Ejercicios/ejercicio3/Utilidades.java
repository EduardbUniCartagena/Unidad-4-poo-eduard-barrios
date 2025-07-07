package Taller7.Ejercicios.ejercicio3;

//Clase de utilidad pública
public class Utilidades {
    //Constructor privado para evitar que la clase sea instanciada
    private Utilidades() {
    }

    //Metodo público para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    //Metodo público para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    //Metodo público para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    //Metodo público para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0; // Evitar división por cero
        }
        return a / b;
    }
}