package Taller8.Ejercicios.ejercicio2;

//Estudiante hereda de Persona
public class Estudiante extends Persona {
    //Atributo propio
    private String matricula;

    //Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        //Llama al constructor de Persona
        super(nombre, edad);
        this.matricula = matricula;
    }

    //Sobrescribe el metodo del padre
    @Override
    public void mostrarDetalles() {
        //Llama al metodo original para mostrar nombre y edad
        super.mostrarDetalles();
        //Muestra su propia información
        System.out.println("Matrícula: " + this.matricula);
    }
}