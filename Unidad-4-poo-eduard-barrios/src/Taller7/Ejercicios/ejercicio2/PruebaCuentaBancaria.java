package Taller7.Ejercicios.ejercicio2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        //Se crea la instancia
        CuentaBancaria cuenta = new CuentaBancaria("123-456-789", 500.0, "Ahorros");

        //Se accede al atributo público directamente
        System.out.println("Tipo de cuenta (público): " + cuenta.tipoCuenta);

        //Se usa el método público para ver los detalles
        cuenta.mostrarDetalles();

        // --- Observando el error de compilación ---
        // La siguiente línea dará un error si la descomentas, porque
        // 'numeroCuenta' es privado y no se puede acceder desde aquí.

        // System.out.println(cuenta.numeroCuenta); //
    }
}