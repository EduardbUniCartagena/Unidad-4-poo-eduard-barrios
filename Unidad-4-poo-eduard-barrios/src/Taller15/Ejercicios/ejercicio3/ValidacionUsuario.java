package Taller15.Ejercicios.ejercicio3;

//3. Clase solo para la validación
public class ValidacionUsuario {
    public boolean validarEmail(Usuario usuario) {
        return usuario.getEmail() != null && usuario.getEmail().contains("@");
    }
}