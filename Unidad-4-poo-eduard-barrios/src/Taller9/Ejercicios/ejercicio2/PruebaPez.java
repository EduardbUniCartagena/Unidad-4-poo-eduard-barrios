package Taller9.Ejercicios.ejercicio2;

public class PruebaPez {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Pez pez1 = new Pez("Salmón", "Agua dulce y salada");

        //Se llama al metodo sobrescrito
        pez1.mostrarEspecie();
    }
}