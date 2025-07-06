package Taller3.Ejercicios;

public class Coche {

    //Atributos de instancia
    String marca;
    String modelo;

    //Atributo estático para contar las instancias
    static int contadorCoches = 0; //

    //Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        //Incrementa el contador estático cada vez que se crea un objeto
        contadorCoches++; //
    }

    //Metodo estático para mostrar el contador
    public static void mostrarContador() { //
        System.out.println("Número de coches creados: " + contadorCoches);
    }
}