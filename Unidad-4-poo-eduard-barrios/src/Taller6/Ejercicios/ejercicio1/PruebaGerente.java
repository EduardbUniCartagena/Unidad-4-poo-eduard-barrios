package Taller6.Ejercicios.ejercicio1;


public class PruebaGerente {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Gerente gerente1 = new Gerente("Ana Sofía", 4500.0, "Tecnología");

        //Se llama al metodo sobrescrito
        gerente1.mostrarInformacion();
    }
}