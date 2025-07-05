package Taller1.Ejercicios;


public class Libro {

    //Propiedades de la clase Libro
    String titulo;
    String autor;
    int numeroPaginas;

    /**
     * Constructor por defecto.
     */
    public Libro() {
        this.titulo = "Título Desconocido";
        this.autor = "Autor Anónimo";
        this.numeroPaginas = 0;
    }

    //Constructor parametrizado.
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Metodo para mostrar los detalles del libro.
    @Override
    public String toString() {
        return "Libro {" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
