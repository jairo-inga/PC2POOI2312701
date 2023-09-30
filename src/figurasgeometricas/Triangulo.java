package figurasgeometricas;
import java.util.Scanner;

public class Triangulo {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public double getPerimetro() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    private double calcularDistancia(Punto punto1, Punto punto2) {
        return Math.sqrt(Math.pow(punto2.getCoordenadaX() - punto1.getCoordenadaX(), 2) +
                         Math.pow(punto2.getCoordenadaY() - punto1.getCoordenadaY(), 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas para el vertice 1:");
        System.out.print("Coordenada X: ");
        double x1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Coordenada Y: ");
        double y1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese las coordenadas para el vertice 2:");
        System.out.print("Coordenada X: ");
        double x2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Coordenada Y: ");
        double y2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese las coordenadas para el vertice 3:");
        System.out.print("Coordenada X: ");
        double x3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Coordenada Y: ");
        double y3 = scanner.nextDouble();
        scanner.nextLine();

        Punto punto1 = new Punto(x1, y1);
        Punto punto2 = new Punto(x2, y2);
        Punto punto3 = new Punto(x3, y3);

        Triangulo miTriangulo = new Triangulo(punto1, punto2, punto3);
        System.out.println("Perímetro del triángulo: " + miTriangulo.getPerimetro());
        System.out.println("Tipo de triángulo: " + miTriangulo.getTipo());

        scanner.close(); // Cerrar el scanner cuando ya no se necesite
    }
}
