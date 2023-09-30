package figurasgeometricas;
import java.util.Scanner;

public class Punto {
    private double coordenadaX;
    private double coordenadaY;

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la coordenada X: ");
        double coordenadaX = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después del número

        System.out.print("Introduce la coordenada Y: ");
        double coordenadaY = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después del número

        Punto miPunto = new Punto(coordenadaX, coordenadaY);

        System.out.println("Coordenada X: " + miPunto.getCoordenadaX());
        System.out.println("Coordenada Y: " + miPunto.getCoordenadaY());

        scanner.close(); // Cerrar el scanner cuando ya no se necesite
    }
}

