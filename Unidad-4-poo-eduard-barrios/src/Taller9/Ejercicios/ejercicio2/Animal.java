package Taller9.Ejercicios.ejercicio2;

public class Animal {
    //Atributo
    protected String especie;

    //Constructor
    public Animal(String especie) {
        this.especie = especie;
    }

    //Metodo para mostrar detalles
    public void mostrarEspecie() {
        System.out.println("Especie: " + this.especie);
    }
}