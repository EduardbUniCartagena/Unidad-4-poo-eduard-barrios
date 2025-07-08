package Taller14.Ejemplos.ejemplo1;

// Clases derivadas
public class Gerente extends Empleado {
    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}