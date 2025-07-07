package Taller6.Ejercicios.ejercicio3;

public class Banco {
    //El saldo no debería ser protected por seguridad
    protected double saldo; //

    //Constructor
    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}
/*
¿Por Qué es Inseguro?
Esta implementación no es segura por dos razones principales:

Acceso desde el mismo paquete: Cualquier otra clase dentro del paquete Taller6.Ejercicios.ejercicio3 puede acceder y modificar el saldo directamente sin ninguna restricción. Por ejemplo, miCuenta.saldo = -1000; sería una operación válida que corrompería el estado del objeto.

Acceso desde subclases: Cualquier subclase, sin importar en qué paquete se encuentre, puede heredar de Banco y tener acceso directo al saldo, pudiendo manipularlo libremente.

Esto rompe completamente el principio de encapsulamiento, que busca proteger el estado interno de un objeto.*/
