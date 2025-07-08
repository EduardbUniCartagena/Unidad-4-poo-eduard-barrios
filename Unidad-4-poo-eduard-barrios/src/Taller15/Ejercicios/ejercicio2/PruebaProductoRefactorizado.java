package Taller15.Ejercicios.ejercicio2;

public class PruebaProductoRefactorizado {
    public static void main(String[] args) {
        //Se crea el objeto de datos
        Producto miProducto = new Producto("Laptop", 1000.0);

        //Se usan los servicios especializados
        PrecioService servicioDePrecios = new PrecioService();
        double precioFinal = servicioDePrecios.calcularPrecioFinal(miProducto, 0.19);
        System.out.println("El precio final es: $" + precioFinal);

        EtiquetaService servicioDeEtiquetas = new EtiquetaService();
        servicioDeEtiquetas.generarEtiqueta(miProducto);
    }
}