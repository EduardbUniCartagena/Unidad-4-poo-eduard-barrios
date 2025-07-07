package Taller5.Ejemplos;

public class PruebaEmpleado {
    public static void main(String[] args) {
        //Se puede crear una instancia porque están en el mismo paquete
        Empleado emp1 = new Empleado("Juan Pérez", 2500.0);

        //Se puede acceder al metodo y a los atributos directamente
        emp1.mostrarInformacion();
        System.out.println("Accediendo al nombre directamente: " + emp1.nombre);
    }
}
