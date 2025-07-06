package Taller3.Ejercicios;

public class PerfilUsuarioFixed {
    //Atributo de instancia
    String username;

    public PerfilUsuarioFixed(String username) {
        this.username = username;
    }

    //Metodo corregido (ya no es estático)
    public void cambiarUsername(String nuevoUsername) {
        //Ahora sí puede acceder al atributo de la instancia
        this.username = nuevoUsername;
    }
}