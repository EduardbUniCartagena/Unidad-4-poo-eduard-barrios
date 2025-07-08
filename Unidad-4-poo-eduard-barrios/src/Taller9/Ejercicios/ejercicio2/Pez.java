package Taller9.Ejercicios.ejercicio2;

//Pez hereda de Animal
public class Pez extends Animal {
    //Atributo propio
    private String tipoDeAgua;

    //Constructor
    public Pez(String especie, String tipoDeAgua) {
        //Llama al constructor de Animal
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    //Sobrescribe el método del padre
    @Override
    public void mostrarEspecie() {
        //Llama al método original para mostrar la especie
        super.mostrarEspecie();
        //Muestra su propia información
        System.out.println("Tipo de Agua: " + this.tipoDeAgua);
    }
}