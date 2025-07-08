package Taller14.Ejercicios.ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        //Se crean referencias de tipo Figura que apuntan a objetos de las subclases
        Figura figura1 = new Circulo(10);
        Figura figura2 = new Rectangulo(8, 5);

        //Se demuestra el polimorfismo
        figura1.calcularArea(); //Llama al método de Circulo
        figura2.calcularArea(); //Llama al método de Rectangulo
    }
}