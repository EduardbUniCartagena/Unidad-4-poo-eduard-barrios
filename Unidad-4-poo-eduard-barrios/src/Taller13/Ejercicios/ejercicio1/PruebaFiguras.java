package Taller13.Ejercicios.ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        //Se crean instancias de las clases concretas
        Rectangulo miRectangulo = new Rectangulo(10, 5);
        Triangulo miTriangulo = new Triangulo(10, 5);

        //Se muestran sus áreas
        System.out.println("Área del rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Área del triángulo: " + miTriangulo.calcularArea());
    }
}