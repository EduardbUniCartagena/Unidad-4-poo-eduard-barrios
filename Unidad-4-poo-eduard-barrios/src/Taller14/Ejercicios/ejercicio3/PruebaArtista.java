package Taller14.Ejercicios.ejercicio3;

public class PruebaArtista {
    public static void main(String[] args) {
        //La referencia es de tipo Artista, pero el objeto es un Mago
        Artista artista = new Mago();

        //Esta llamada es válida porque presentar() existe en Artista
        artista.presentar();

        //ERROR: La siguiente línea no compila porque el metodo hacerTruco()
        //no está definido en la clase de la referencia (Artista).
        //artista.hacerTruco();
    }
}