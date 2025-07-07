package Taller6.Ejemplos.ejemplo2;

public class Perro extends Animal {
    public Perro(String especie) {
        super(especie);
    }
    @Override
    protected void emitirSonido() {
        System.out.println("El perro ladra.");
    }
}