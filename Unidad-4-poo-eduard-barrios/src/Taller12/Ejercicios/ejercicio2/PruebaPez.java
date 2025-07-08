package Taller12.Ejercicios.ejercicio2;

public class PruebaPez {
    public static void main(String[] args) {
        //Se crea una instancia de Pez
        Pez miPez = new Pez();

        //Se usan ambos métodos de las interfaces implementadas
        miPez.nadar();
        miPez.respirar();
    }
}