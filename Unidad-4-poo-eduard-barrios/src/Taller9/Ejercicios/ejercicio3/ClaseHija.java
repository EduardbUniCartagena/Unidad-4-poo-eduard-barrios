package Taller9.Ejercicios.ejercicio3;

public class ClaseHija extends ClasePadre {
    public void intentarAcceder() {
        //La siguiente línea da error porque 'secreto' es privado en ClasePadre,
        //y 'super' no puede saltarse esa restricción.
        //System.out.println(super.secreto);
    }
}