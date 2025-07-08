package Taller15.Ejemplos.ejemplo2;

public class PruebaPedido {
    public static void main(String[] args) {
        //1. Se crea el objeto de datos
        Pedido miPedido = new Pedido(200.0);

        //2. Se usan los servicios especializados
        CalculoTotalService calculoService = new CalculoTotalService();
        double impuestos = calculoService.calcularImpuestos(miPedido);
        System.out.println("Impuestos del pedido: $" + impuestos);

        EnvioService envioService = new EnvioService();
        envioService.enviarPedido(miPedido);
    }
}