package figurasgeometricas;

public class Rectangulo {
    private float largo;
    private float ancho;

    public Rectangulo() {
        this.largo = 1.0f;
        this.ancho = 1.0f;
    }

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
        Rectangulo miRectangulo = new Rectangulo(2.5f, 3.0f);
        System.out.println("Largo: " + miRectangulo.getLargo()); 
        System.out.println("Ancho: " + miRectangulo.getAncho()); 
        System.out.println("Área: " + miRectangulo.getArea());   
    }
}

/*
 * Largo: 2.5
Ancho: 3.0
Área: 7.5
*/
