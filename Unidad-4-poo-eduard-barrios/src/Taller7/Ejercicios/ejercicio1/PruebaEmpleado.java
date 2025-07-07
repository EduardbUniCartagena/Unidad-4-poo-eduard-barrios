package Taller7.Ejercicios.ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        //Se crea la instancia
        Empleado emp1 = new Empleado("Roberto Carlos", 3000.0);

        //Se accede y modifica directamente el atributo público 'nombre'
        System.out.println("Nombre inicial: " + emp1.nombre);
        emp1.nombre = "Roberto C. Aguilar";
        System.out.println("Nombre modificado: " + emp1.nombre);

        //Se accede a 'salario' a través de sus métodos públicos
        System.out.println("\nSalario inicial: " + emp1.getSalario());
        emp1.setSalario(3200.0);
        System.out.println("Salario modificado: " + emp1.getSalario());
    }
}