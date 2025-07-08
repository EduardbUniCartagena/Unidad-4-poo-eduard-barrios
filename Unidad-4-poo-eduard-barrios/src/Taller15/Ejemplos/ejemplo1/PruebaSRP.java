package Taller15.Ejemplos.ejemplo1;

public class PruebaSRP {
    public static void main(String[] args) {
        //1. Se crea el objeto de datos
        Usuario usuario = new Usuario("admin", "1234");

        //2. Se usa el servicio de autenticación
        AutenticacionService authService = new AutenticacionService();
        if (authService.autenticar(usuario, "1234")) {
            System.out.println("Autenticación exitosa.");

            //3. Si la autenticación es exitosa, se usa el servicio de informes
            InformeService informeService = new InformeService();
            informeService.generarInformeUsuario(usuario);
        } else {
            System.out.println("Fallo en la autenticación.");
        }
    }
}