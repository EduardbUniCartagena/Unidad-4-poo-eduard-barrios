package Taller15.Ejercicios.ejercicio3;

public class PruebaUsuarioRefactorizado {
    public static void main(String[] args) {
        //Se crea el objeto de datos
        Usuario miUsuario = new Usuario("carlos", "clave123", "carlos@email.com");

        //Se usan los servicios especializados
        ValidacionUsuario validador = new ValidacionUsuario();
        if (validador.validarEmail(miUsuario)) {
            System.out.println("El email es válido.");

            AutenticacionUsuario autenticador = new AutenticacionUsuario();
            if (autenticador.autenticar(miUsuario, "clave123")) {
                System.out.println("Usuario autenticado exitosamente.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        } else {
            System.out.println("El email no es válido.");
        }
    }
}