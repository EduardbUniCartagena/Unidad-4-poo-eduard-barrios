package Taller4.Ejercicios;

public class CajaFuerte {
    //Atributo privado sin getters ni setters
    private String combinacion;

    public CajaFuerte(String combinacionInicial) {
        this.combinacion = combinacionInicial;
    }

    //No hay métodos getCombinacion() o setCombinacion()
    //Encapsulación Máxima: Al no tener métodos get o set, el atributo combinacion está completamente aislado del mundo exterior. Es "solo para uso interno" de la clase.
    //Una vez que se crea un objeto CajaFuerte, su combinacion no puede ser leída ni modificada desde fuera. El valor que se le da en el constructor es, en efecto, final desde la perspectiva de otras clases.
}