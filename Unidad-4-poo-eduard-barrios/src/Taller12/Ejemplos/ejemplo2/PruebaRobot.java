package Taller12.Ejemplos.ejemplo2;

public class PruebaRobot {
    public static void main(String[] args) {
        //Se crea una instancia de Robot
        Robot miRobot = new Robot();

        //Se llaman a los métodos de las interfaces implementadas
        miRobot.caminar();
        miRobot.hablar();
    }
}