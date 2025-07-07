package Taller8.Ejercicios.ejercicio3;

public class PruebaEmpleados {
    public static void main(String[] args) {
        //Se crea una instancia de la clase base
        Empleado empleado1 = new Empleado("Juan", 2000.0);
        System.out.println("--- Detalles del Empleado ---");
        empleado1.mostrarDetalles();

        System.out.println(); //Salto de línea

        //Se crea una instancia de la subclase
        Gerente gerente1 = new Gerente("Ana", 4500.0, "Ventas");
        System.out.println("--- Detalles del Gerente ---");
        gerente1.mostrarDetalles();
    }
}