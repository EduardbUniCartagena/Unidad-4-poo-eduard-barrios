package Taller15.Ejercicios.ejercicio3;

//Esta clase viola el SRP
public class UsuarioConMalaPractica {
    //Atributos
    private String username;
    private String password;
    private String email;

    //Constructor
    public UsuarioConMalaPractica(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //1ra Responsabilidad: Datos
    public String getUsername() { return username; }

    //2da Responsabilidad: Autenticación
    public boolean autenticar(String password) {
        return this.password.equals(password);
    }

    //3ra Responsabilidad: Validación
    public boolean validarEmail() {
        return this.email.contains("@");
    }
}