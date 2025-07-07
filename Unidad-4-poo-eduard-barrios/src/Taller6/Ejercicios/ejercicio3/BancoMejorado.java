/*
* La solución correcta es declarar el atributo saldo como private y proporcionar métodos public para interactuar con él de forma controlada.
* */
package Taller6.Ejercicios.ejercicio3;

public class BancoMejorado {
    //El saldo ahora es privado, máximo nivel de protección
    private double saldo;

    //Constructor
    public BancoMejorado(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    //Metodo público para leer el saldo (getter)
    public double getSaldo() {
        return this.saldo;
    }

    //Metodo público para depositar, con validación
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    //Metodo público para retirar, con validación
    public void retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}