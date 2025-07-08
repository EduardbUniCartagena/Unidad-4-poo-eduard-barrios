package Taller11.Ejemplos.ejemplo1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        //No se puede crear una instancia de una clase abstracta
        //Empleado emp = new Empleado("Genérico"); //Esto daría error

        //Se crea una instancia de la clase concreta
        Gerente gerente1 = new Gerente("Carlos", 500.0);

        //Se llama al metodo concreto heredado
        gerente1.mostrarNombre();

        //Se llama al metodo abstracto que fue implementado en Gerente
        gerente1.calcularSalario();
    }
}