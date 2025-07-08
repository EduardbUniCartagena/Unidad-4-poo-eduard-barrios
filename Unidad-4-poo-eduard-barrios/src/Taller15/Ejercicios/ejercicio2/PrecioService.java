package Taller15.Ejercicios.ejercicio2;

//2. Clase solo para la lógica de precios
public class PrecioService {
    public double calcularPrecioFinal(Producto producto, double impuesto) {
        return producto.getPrecioBase() * (1 + impuesto);
    }
}