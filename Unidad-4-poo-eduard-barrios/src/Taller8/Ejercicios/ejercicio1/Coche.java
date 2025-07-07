package Taller8.Ejercicios.ejercicio1;

//Coche hereda de Vehiculo
public class Coche extends Vehiculo {
    //Atributo propio
    private int numeroDePuertas;

    //Constructor
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        //Llama al constructor de Vehiculo
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    //Metodo propio que reutiliza el del padre
    public void mostrarInfoCoche() {
        System.out.println("--- Información del Coche ---");
        //Llama al método del padre
        super.mostrarInfoVehiculo();
        //Muestra su propia información
        System.out.println("Número de Puertas: " + this.numeroDePuertas);
    }
}