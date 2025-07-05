package Taller1.Ejemplos;

public class CocheConThis  {
    String marca;
    String modelo;
    // Constructor con un parámetro
    public CocheConThis(String marca) {
        this.marca = marca;
    }
    // Llamada al constructor anterior usando `this()`
    public CocheConThis(String marca, String modelo) {
        this(marca); // Llama al constructor de un solo parámetro
        this.modelo = modelo;
    }
}