package Taller5.Ejercicios;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado Mecánico", 75.99, 50);

        //Se accede al metodo y a los atributos directamente
        p1.mostrarInfo();
        p1.stock = 49;
        System.out.println("Stock actualizado: " + p1.stock);
    }
}