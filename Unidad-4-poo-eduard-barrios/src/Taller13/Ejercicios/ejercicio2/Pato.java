package Taller13.Ejercicios.ejercicio2;

//Clase que implementa ambas interfaces
public class Pato implements Volador, Nadador {
    //Implementación del método de Volador
    @Override
    public void volar() {
        System.out.println("El pato está volando bajo sobre el lago.");
    }

    //Implementación del método de Nadador
    @Override
    public void nadar() {
        System.out.println("El pato está nadando tranquilamente.");
    }
}