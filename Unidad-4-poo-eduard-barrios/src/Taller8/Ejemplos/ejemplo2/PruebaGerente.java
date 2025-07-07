package Taller8.Ejemplos.ejemplo2;

public class PruebaGerente {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Gerente gerente = new Gerente("Luisa", 5000.0, "Sistemas");

        //Se llama al metodo que muestra toda la información
        gerente.mostrarDetalles();
    }
}