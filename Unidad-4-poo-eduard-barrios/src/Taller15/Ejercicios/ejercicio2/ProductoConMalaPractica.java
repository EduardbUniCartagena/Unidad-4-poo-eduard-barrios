package Taller15.Ejercicios.ejercicio2;

//Esta clase viola el SRP
public class ProductoConMalaPractica {
    //Atributos
    private String nombre;
    private double precioBase;

    //Constructor
    public ProductoConMalaPractica(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    //1ra Responsabilidad: Manejo de datos
    public String getNombre() {
        return nombre;
    }

    //2da Responsabilidad: Cálculo de precios
    public double calcularPrecioFinal(double impuesto) {
        return precioBase * (1 + impuesto);
    }

    //3ra Responsabilidad: Generación de etiquetas
    public void generarEtiqueta() {
        System.out.println("Etiqueta para: " + nombre);
    }
}