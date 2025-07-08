package Taller9.Ejercicios.ejercicio1;

//Empleado hereda de Persona
public class Empleado extends Persona {
    //Atributo propio
    private String departamento;

    //Constructor
    public Empleado(String nombre, int edad, String departamento) {
        //Llama al constructor de Persona
        super(nombre, edad);
        this.departamento = departamento;
    }

    //Sobrescribe el método del padre
    @Override
    public void mostrarDetalles() {
        //Llama al método original para mostrar nombre y edad
        super.mostrarDetalles();
        //Muestra su propia información
        System.out.println("Departamento: " + this.departamento);
    }
}