package Taller15.Ejemplos.ejemplo2;

// Clase CalculoTotalService (responsable del cálculo del total)
public class CalculoTotalService {
    public double calcularImpuestos(Pedido pedido) {
        return pedido.getTotal() * 0.15;
    }
}
