package Taller2.Ejercicios;

public class Producto {

    //Atributos de la clase
    String nombre;
    double precio;

    //Constructor que usa 'this' para diferenciar atributos de parámetros
    public Producto(String nombre, double precio) {
        this.nombre = nombre; //
        this.precio = precio; //
    }

    //Metodo que imprime los detalles del producto
    public void mostrarProducto() {
        System.out.println("--- Detalles del Producto ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
    }
}