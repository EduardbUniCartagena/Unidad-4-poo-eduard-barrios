package Taller3.Ejercicios;

public class PruebaCoche {
    public static void main(String[] args) {
        System.out.println("Creando coches...");

        Coche coche1 = new Coche("Ford", "Mustang");
        Coche coche2 = new Coche("Chevrolet", "Camaro");
        Coche coche3 = new Coche("Dodge", "Challenger");

        //Llamamos al método estático directamente desde la clase
        Coche.mostrarContador(); //Debería imprimir 3
    }
}