package Taller6.Ejercicios.ejercicio2;

//Moto hereda de Vehiculo
public class Moto extends Vehiculo {
    //Propiedad adicional
    private int cilindrada;

    //Constructor
    public Moto(String marca, int cilindrada) {
        super("Motocicleta", marca);
        this.cilindrada = cilindrada;
    }
}