package Taller13.Ejemplos.ejemplo1;

public class PruebaFigura {
    public static void main(String[] args) {
        //Se crea una instancia de la clase concreta
        Circulo miCirculo = new Circulo(5.0);

        //Se llama al metodo concreto heredado de Figura
        miCirculo.mostrarFigura();

        //Se llama al metodo implementado en Circulo
        double area = miCirculo.calcularArea();
        System.out.println("El área del círculo es: " + area);
    }
}