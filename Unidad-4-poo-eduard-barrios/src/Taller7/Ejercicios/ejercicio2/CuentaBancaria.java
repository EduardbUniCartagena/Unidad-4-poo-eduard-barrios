package Taller7.Ejercicios.ejercicio2;

public class CuentaBancaria {
    //Propiedades con diferente visibilidad
    private String numeroCuenta; //
    private double saldo; //
    public String tipoCuenta; //

    //Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    //Getter público para saldo
    public double getSaldo() { //
        return this.saldo;
    }

    //Setter público para saldo
    public void setSaldo(double saldo) { //
        this.saldo = saldo;
    }

    //Metodo público para mostrar detalles
    public void mostrarDetalles() { //
        System.out.println("Tipo: " + tipoCuenta + ", Número: " + numeroCuenta + ", Saldo: $" + saldo);
    }
}