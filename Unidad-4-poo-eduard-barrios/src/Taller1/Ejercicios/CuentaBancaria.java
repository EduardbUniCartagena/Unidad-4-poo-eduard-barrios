package Taller1.Ejercicios;

public class CuentaBancaria {

    //Propiedades
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    //Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000";
        this.saldo = 1000;
        this.tipoCuenta = "Ahorros";
    }

    //Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0; // Saldo inicial por defecto
    }

    //Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    //Metodo para mostrar los detalles
    @Override
    public String toString() {
        return "CuentaBancaria {" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }
}