package Taller3.Ejercicios;

public class PerfilUsuarioError {
    //Atributo de instancia (no estático)
    String username;

    public PerfilUsuarioError(String username) {
        this.username = username;
    }

    //Método estático que intenta acceder a un atributo no estático
   /* public static void cambiarUsername(String nuevoUsername) {
        //La siguiente línea da error de compilación
        username = nuevoUsername;
    }*/
}

// Error: Non-static field 'username' cannot be referenced from a static context
//El error que recibimos al compilar este codigo se debe a que estamos tratando de modificar un atributo estatico.