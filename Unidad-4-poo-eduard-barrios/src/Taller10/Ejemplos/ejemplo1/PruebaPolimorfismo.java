package Taller10.Ejemplos.ejemplo1;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        //Se crean instancias de la clase base y la subclase
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente();

        //Se llama al metodo trabajar() en cada objeto
        empleado.trabajar(); //Llama al metodo de Empleado
        gerente.trabajar();  //Llama al metodo sobrescrito de Gerente
    }
}