package figurasgeometricas;
import java.util.Scanner;

public class Rectangulo {
    private float largo;
    private float ancho;

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public float getAncho() {
        return ancho;
    }

    public float getArea() {
        return largo * ancho;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el largo del rectángulo: ");
        float largo = scanner.nextFloat();
        scanner.nextLine(); 
        
        System.out.print("Introduce el ancho del rectángulo: ");
        float ancho = scanner.nextFloat();
        scanner.nextLine(); 

        Rectangulo miRectangulo = new Rectangulo(largo, ancho);

        System.out.println("Largo del rectángulo: " + miRectangulo.getLargo());
        System.out.println("Ancho del rectángulo: " + miRectangulo.getAncho());
        System.out.println("Área del rectángulo: " + miRectangulo.getArea());

        scanner.close(); // Cerrar el scanner cuando ya no se necesite
    }
}
