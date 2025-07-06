package Taller3.Ejercicios;

public class PruebaMatematicas {
    public static void main(String[] args) {
        //Se llaman a los métodos estáticos directamente desde la clase
        double suma = Matematicas.sumar(15, 7);
        double resta = Matematicas.restar(15, 7);
        double producto = Matematicas.multiplicar(10, 5);
        double division = Matematicas.dividir(10, 5);

        //Se muestran los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + producto);
        System.out.println("División: " + division);
    }
}