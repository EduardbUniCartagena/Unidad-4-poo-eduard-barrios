package Taller12.Ejercicios.ejercicio2;

//Crea una clase Pez que implemente ambas interfaces
public class Pez implements Nadador, Respirador {
    //Implementación del método de Nadador
    @Override
    public void nadar() {
        System.out.println("El pez se mueve elegantemente por el agua.");
    }

    //Implementación del método de Respirador
    @Override
    public void respirar() {
        System.out.println("El pez está respirando a través de sus branquias.");
    }
}