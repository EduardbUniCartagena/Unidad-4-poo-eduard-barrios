package Taller4.Ejercicios;

public class PruebaSecreto {
    public static void main(String[] args) {
        Secreto miSecreto = new Secreto();

        //La siguiente línea producirá un error de compilación porque
        //'mensajeSecreto' es privado en la clase Secreto.
        //System.out.println(miSecreto.mensajeSecreto);
    }
}