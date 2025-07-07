package Taller5.Ejemplos;

public class PruebaProducto {
    public static void main(String[] args) {
        // Creamos una instancia de Producto.
        // Esto es posible porque ambas clases están en el paquete Taller5.Ejemplos.
        Producto producto1 = new Producto("Laptop Gamer", 1500.75);

        // Llamamos a su metodo con acceso de paquete.
        producto1.mostrarInfo();

        // También podemos acceder a sus atributos directamente.
        System.out.println("Acceso directo al atributo precio: " + producto1.precio);
    }
}