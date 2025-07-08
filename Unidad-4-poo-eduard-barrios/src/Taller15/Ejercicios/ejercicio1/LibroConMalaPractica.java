package Taller15.Ejercicios.ejercicio1;

//Esta clase viola el SRP
public class LibroConMalaPractica {
    //Atributos
    private String titulo;
    private String autor;

    //Constructor
    public LibroConMalaPractica(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //1ra Responsabilidad: Manejo de datos
    public String getTitulo() {
        return titulo;
    }

    //2da Responsabilidad: Generación de reportes
    public void generarReporte() {
        System.out.println("Generando reporte para el libro: " + titulo);
    }

    //3ra Responsabilidad: Persistencia
    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando el libro '" + titulo + "' en la base de datos.");
    }
}