package Taller1.Ejercicios;

//Se importan las clases que vamos a usar
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        //Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Proyecto Integrador - Taller 1 ###");

        //--- 1. Crear objetos usando diferentes constructores ---
        System.out.println("\n--- Creando objetos predefinidos...");
        //Se crea un Estudiante con el constructor por defecto
        Estudiante estudianteDefecto = new Estudiante();
        //Se crea una CuentaBancaria con el constructor de tres parámetros
        CuentaBancaria cuentaAhorros = new CuentaBancaria("987654321", 500000, "Ahorros");


        //--- 2. Crear un objeto con datos ingresados por consola ---
        System.out.println("\n--- Ingrese los datos para un nuevo Libro ---");
        System.out.print("Introduce el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce el autor: ");
        String autor = scanner.nextLine();

        System.out.print("Introduce el número de páginas: ");
        int paginas = scanner.nextInt();


        //Se crea el objeto Libro con los datos del usuario
        Libro libroUsuario = new Libro(titulo, autor, paginas);


        //--- 3. Mostrar los detalles de todos los objetos creados ---
        System.out.println("\n### Detalles de los Objetos ###");
        System.out.println(estudianteDefecto); 
        System.out.println(cuentaAhorros);
        System.out.println(libroUsuario);

        //Se cierra el scanner para liberar recursos
        scanner.close();
    }
}