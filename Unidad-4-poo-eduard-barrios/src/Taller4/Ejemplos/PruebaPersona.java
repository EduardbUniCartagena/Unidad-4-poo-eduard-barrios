package Taller4.Ejemplos;

public class PruebaPersona {
    public static void main(String[] args) {
        //Se crea una instancia de Persona
        Persona persona1 = new Persona("Ana", 25);

        //Se leen los datos usando los getters
        System.out.println("Nombre inicial: " + persona1.getNombre());
        System.out.println("Edad inicial: " + persona1.getEdad());

        //Se modifican los datos usando los setters
        System.out.println("\nActualizando datos...");
        persona1.setNombre("Ana López");
        persona1.setEdad(26);

        //Se muestran los datos actualizados
        System.out.println("Nombre actualizado: " + persona1.getNombre());
        System.out.println("Edad actualizada: " + persona1.getEdad());

        }
}