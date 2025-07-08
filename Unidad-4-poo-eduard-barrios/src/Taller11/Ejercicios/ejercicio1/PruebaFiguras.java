package Taller11.Ejercicios.ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        //Se crean instancias de las clases concretas
        Circulo miCirculo = new Circulo(10);
        Rectangulo miRectangulo = new Rectangulo(5, 8);

        //Se llama al metodo concreto de la clase abstracta,
        //que a su vez llama al metodo abstracto implementado.
        miCirculo.mostrarArea();
        miRectangulo.mostrarArea();
    }
}