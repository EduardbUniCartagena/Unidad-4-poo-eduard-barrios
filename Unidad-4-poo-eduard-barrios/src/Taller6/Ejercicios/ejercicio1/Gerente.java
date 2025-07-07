package Taller6.Ejercicios.ejercicio1;


//Gerente hereda de Empleado
public class Gerente extends Empleado {
    //Propiedad adicional
    private String departamento; //

    //Constructor
    public Gerente(String nombre, double salario, String departamento) {
        //Llama al constructor de la clase padre (Empleado)
        super(nombre, salario);
        this.departamento = departamento;
    }

    //Sobrescribe el metodo de la clase padre para añadir más detalles
    @Override
    public void mostrarInformacion() { //
        //Llama al metodo original del padre para no repetir código
        super.mostrarInformacion();
        //Añade la información específica del gerente
        System.out.println("Departamento: " + this.departamento);
    }
}