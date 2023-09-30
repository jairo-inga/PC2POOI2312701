package figurasgeometricas;
import java.util.Scanner;

public class Circulo {
    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Introduce el color del círculo: ");
        String color = scanner.nextLine();

        Circulo miCirculo = new Circulo(radio, color);
        System.out.println("Radio del círculo: " + miCirculo.getRadio());
        System.out.println("Área del círculo: " + miCirculo.getArea());

        scanner.close(); 
    }
}
