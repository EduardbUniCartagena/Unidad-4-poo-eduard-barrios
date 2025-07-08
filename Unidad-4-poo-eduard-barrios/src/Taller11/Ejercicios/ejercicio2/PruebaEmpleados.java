package Taller11.Ejercicios.ejercicio2;

public class PruebaEmpleados {
    public static void main(String[] args) {
        //Se crean instancias de las clases concretas
        Gerente gerente = new Gerente("Laura", 3000, 800);
        Vendedor vendedor = new Vendedor("Pedro", 1500, 450);

        //Se muestran los detalles de cada uno
        gerente.mostrarDetalles();
        System.out.println("--------------------");
        vendedor.mostrarDetalles();
    }
}