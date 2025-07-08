package Taller15.Ejercicios.ejercicio1;

public class PruebaLibroRefactorizado {
    public static void main(String[] args) {
        //Se crea el objeto de datos
        Libro miLibro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien");

        //Se usan los servicios especializados
        PersistenciaLibro persistencia = new PersistenciaLibro();
        persistencia.guardar(miLibro);

        ReporteLibro reporte = new ReporteLibro();
        reporte.generarReporte(miLibro);
    }
}