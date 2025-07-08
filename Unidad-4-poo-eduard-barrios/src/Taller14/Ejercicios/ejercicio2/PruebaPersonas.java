package Taller14.Ejercicios.ejercicio2;

public class PruebaPersonas {
    public static void main(String[] args) {
        //Se crea un arreglo de tipo Persona para demostrar polimorfismo
        Persona[] gente = new Persona[3];
        gente[0] = new Persona();
        gente[1] = new Estudiante();
        gente[2] = new Profesor();

        //Se recorre el arreglo y se llama al mismo metodo en cada objeto
        for (Persona p : gente) {
            //Se ejecuta la versión correcta del metodo para cada objeto
            p.presentarse();
        }
    }
}