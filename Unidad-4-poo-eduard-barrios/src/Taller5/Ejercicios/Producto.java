package Taller5.Ejercicios;

//Clase con acceso de paquete
class Producto {
    //Propiedades con acceso de paquete
    String nombre;
    double precio;
    int stock;

    //Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Metodo con acceso de paquete
    void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio + ", Stock: " + stock);
    }
}