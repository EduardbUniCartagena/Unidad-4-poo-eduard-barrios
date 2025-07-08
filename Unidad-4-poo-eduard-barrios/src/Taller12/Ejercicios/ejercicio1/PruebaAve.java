package Taller12.Ejercicios.ejercicio1;

public class PruebaAve {
    public static void main(String[] args) {
        //Se crea una instancia de Ave
        Ave miAve = new Ave();

        //Se usan ambos métodos de las interfaces implementadas
        miAve.cantar();
        miAve.volar();
    }
}