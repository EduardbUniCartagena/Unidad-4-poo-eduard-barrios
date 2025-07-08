package Taller10.Ejercicios.ejercicio2;

public class PruebaMovimiento {
    public static void main(String[] args) {
        //Se crean las instancias
        Vehiculo vehiculoGenerico = new Vehiculo();
        Bicicleta miBici = new Bicicleta();

        //Se llama al metodo en cada objeto
        vehiculoGenerico.moverse(); //Llama al metodo de Vehiculo
        miBici.moverse();          //Llama al metodo sobrescrito de Bicicleta
    }
}