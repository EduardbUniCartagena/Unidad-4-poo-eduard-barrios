package Taller15.Ejercicios.ejercicio1;

//1. Clase solo para los datos del libro
public class Libro {
    //Atributos
    private String titulo;
    private String autor;

    //Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
}