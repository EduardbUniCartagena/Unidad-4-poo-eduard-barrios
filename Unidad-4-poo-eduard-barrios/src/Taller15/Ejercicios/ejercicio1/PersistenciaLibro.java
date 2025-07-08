package Taller15.Ejercicios.ejercicio1;

//3. Clase solo para la persistencia
public class PersistenciaLibro {
    public void guardar(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' en la base de datos.");
    }
}