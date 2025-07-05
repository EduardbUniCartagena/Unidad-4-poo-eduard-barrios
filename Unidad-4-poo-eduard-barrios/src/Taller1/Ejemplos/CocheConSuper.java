package Taller1.Ejemplos;

public class CocheConSuper extends Vehiculo {
    String marca;
    // Llama al constructor de la clase base usando `super()`
    public CocheConSuper(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }
}