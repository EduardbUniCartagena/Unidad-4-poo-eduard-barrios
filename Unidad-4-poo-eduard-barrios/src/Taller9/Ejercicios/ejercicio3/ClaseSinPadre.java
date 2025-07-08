package Taller9.Ejercicios.ejercicio3;

//Esta clase no hereda de ninguna otra explícitamente
public class ClaseSinPadre {
    public void miMetodo() {
        //La siguiente línea da error porque no hay una superclase
        //a la cual referirse con 'super'.
        //System.out.println(super.toString());
    }
}