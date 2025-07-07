package Taller7.Ejercicios.ejercicio3;

public class PruebaUtilidades {
    public static void main(String[] args) {
        //Se definen los números para las operaciones
        double num1 = 20;
        double num2 = 4;

        //Se llaman a los métodos estáticos directamente desde la clase Utilidades
        System.out.println("Suma: " + Utilidades.sumar(num1, num2));
        System.out.println("Resta: " + Utilidades.restar(num1, num2));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(num1, num2));
        System.out.println("División: " + Utilidades.dividir(num1, num2));
    }
}