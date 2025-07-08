package Taller9.Ejercicios.ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        //Se crea una instancia de la subclase
        Empleado empleado1 = new Empleado("Marta", 35, "Recursos Humanos");

        //Se llama al metodo sobrescrito
        empleado1.mostrarDetalles();
    }
}