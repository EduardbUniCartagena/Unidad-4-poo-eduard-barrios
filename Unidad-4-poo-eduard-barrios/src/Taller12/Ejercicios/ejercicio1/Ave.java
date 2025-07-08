package Taller12.Ejercicios.ejercicio1;

//Crea una clase Ave que implemente ambas interfaces
public class Ave implements Volador, Cantante {
    //Implementación del metodo de Volador
    @Override
    public void volar() {
        System.out.println("El ave bate sus alas y vuela por el cielo.");
    }

    //Implementación del metodo de Cantante
    @Override
    public void cantar() {
        System.out.println("El ave emite un trino melodioso.");
    }
}