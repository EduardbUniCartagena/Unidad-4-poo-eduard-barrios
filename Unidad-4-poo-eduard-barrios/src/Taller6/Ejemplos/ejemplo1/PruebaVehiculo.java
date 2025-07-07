package Taller6.Ejemplos.ejemplo1;

public class PruebaVehiculo {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Coche miCoche = new Coche("Ford",80, 5);

        //Se llama al metodo que accede al miembro protegido
        miCoche.mostrarDetalles();
    }
}