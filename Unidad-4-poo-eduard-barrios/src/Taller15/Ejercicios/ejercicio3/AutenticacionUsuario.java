package Taller15.Ejercicios.ejercicio3;

//2. Clase solo para la autenticación
public class AutenticacionUsuario {
    public boolean autenticar(Usuario usuario, String password) {
        return usuario.getPassword().equals(password);
    }
}