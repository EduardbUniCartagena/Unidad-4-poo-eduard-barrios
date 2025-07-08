package Taller15.Ejercicios.ejercicio3;

//1. Clase solo para los datos del usuario
public class Usuario {
    //Atributos
    private String username;
    private String password;
    private String email;

    //Constructor
    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
}