package Taller5.Ejercicios.ejercicio2.paqueteA;

//Esta clase puede heredar de Vehiculo porque están en el mismo paquete
class Moto extends Vehiculo {
    //Constructor
    Moto() {
        //Llama al constructor de la clase padre
        super("Motocicleta");
    }
}