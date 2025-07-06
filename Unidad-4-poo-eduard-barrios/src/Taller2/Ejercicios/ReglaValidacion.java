package Taller2.Ejercicios;

public class ReglaValidacion {

    //Atributo de la clase
    private int numeroIntentos;

    //Constructor
    public ReglaValidacion(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    //Método de instancia corregido (se quita 'static')
    public void mostrarInfo() {
        // Ahora 'this' es válido porque el método pertenece a una instancia
        System.out.println("Intentos: " + this.numeroIntentos);
    }
}