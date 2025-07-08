package Taller12.Ejemplos.ejemplo1;

// Clase Pato que implementa ambas interfaces
public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }
    @Override
    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}
