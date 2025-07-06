package Taller2.Ejercicios;

public class ReglaValidacion {

    //Atributo de la clase
    private int numeroIntentos;

    //Constructor
    public ReglaValidacion(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    //Método estático que intenta usar 'this' incorrectamente
    public static void mostrarInfo() {
        // La siguiente línea causa un error de compilación
        System.out.println("Intentos: " + this.numeroIntentos);
    }
}