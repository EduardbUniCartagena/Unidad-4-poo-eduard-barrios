package Taller6.Ejemplos.ejemplo2;

public class PruebaAnimales {
    public static void main(String[] args) {
        //Se crea una instancia de la clase base
        Animal animalGenerico = new Animal("Indefinido");
        //Se crea una instancia de la subclase
        Perro miPerro = new Perro("Canino");

        System.out.print("Llamando al método del animal genérico: ");
        animalGenerico.emitirSonido(); //Imprime "El animal hace un sonido."

        System.out.print("Llamando al método del perro: ");
        miPerro.emitirSonido(); //Imprime "El perro ladra."
    }
}