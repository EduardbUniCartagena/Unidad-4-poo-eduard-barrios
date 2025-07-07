package Taller8.Ejemplos.ejemplo1;

public class PruebaAnimal {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Perro miPerro = new Perro("Canino", "Labrador");

        //Llamando a un metodo heredado de Animal
        miPerro.mostrarEspecie();

        //Llamando a un metodo propio de Perro
        miPerro.ladrar();

        //Llamando a un metodo sobrescrito
        miPerro.emitirSonido();
    }
}