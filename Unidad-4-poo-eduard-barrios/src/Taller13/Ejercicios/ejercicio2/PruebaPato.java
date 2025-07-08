package Taller13.Ejercicios.ejercicio2;

public class PruebaPato {
    public static void main(String[] args) {
        //Se crea una instancia de Pato
        Pato miPato = new Pato();

        //Se demuestra que el objeto tiene ambos comportamientos
        System.out.println("Probando habilidades del pato:");
        miPato.volar();
        miPato.nadar();
    }
}