package Taller8.Ejercicios.ejercicio3;

//Gerente hereda de Empleado
public class Gerente extends Empleado {
    //Atributo propio
    private String departamento;

    //Constructor
    public Gerente(String nombre, double salario, String departamento) {
        //Llama al constructor de Empleado
        super(nombre, salario);
        this.departamento = departamento;
    }

    //Sobrescribe el metodo del padre
    @Override
    public void mostrarDetalles() {
        //Llama al metodo original para no repetir código
        super.mostrarDetalles();
        //Añade la información específica del gerente
        System.out.println("Departamento: " + this.departamento);
    }
}