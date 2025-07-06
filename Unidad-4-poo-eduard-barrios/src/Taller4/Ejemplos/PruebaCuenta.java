package Taller4.Ejemplos;

public class PruebaCuenta {
    public static void main(String[] args) {
        //Se crea una instancia de CuentaBancaria
        CuentaBancaria miCuenta = new CuentaBancaria(1000.0);

        //No se puede acceder directamente a saldo: miCuenta.saldo (daría error)

        //Se usa el metodo público para leer el saldo
        System.out.println("Saldo inicial: " + miCuenta.getSaldo());

        //Se usa el metodo público para modificar el saldo
        miCuenta.depositar(500.0);

        //Se muestra el saldo actualizado
        System.out.println("Saldo final: " + miCuenta.getSaldo());
    }
}