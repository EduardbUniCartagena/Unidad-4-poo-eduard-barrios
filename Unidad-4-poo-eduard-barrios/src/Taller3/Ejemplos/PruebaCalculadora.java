package Taller3.Ejemplos;

public class PruebaCalculadora {
        public static void main(String[] args) {
            int resultado = Calculadora.sumar(5, 7); // Llama al metodo estático sin crear una instancia
            System.out.println("Resultado: " + resultado); // Muestra: Resultado: 12
        }
}
