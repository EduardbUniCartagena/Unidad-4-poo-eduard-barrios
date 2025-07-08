package Taller10.Ejercicios.ejercicio1;

public class PruebaPresentaciones {
    public static void main(String[] args) {
        //Se crea un arreglo de tipo Persona
        Persona[] personas = new Persona[3];

        //Se asignan objetos de diferentes clases (base y derivadas)
        personas[0] = new Persona();
        personas[1] = new Estudiante();
        personas[2] = new Profesor();

        //Se recorre el arreglo y se llama al mismo metodo en cada objeto
        for (Persona persona : personas) {
            //Java sabe qué versión del metodo ejecutar para cada objeto
            persona.presentarse();
        }
    }
}