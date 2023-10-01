package figurasgeometricas;

public class Punto {
    private double coordenadaX;
    private double coordenadaY;

    public Punto() {
        this.coordenadaX = 0.0;
        this.coordenadaY = 0.0;
    }

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
        Punto miPunto = new Punto(2.5, 3.0);
        System.out.println("Coordenada X: " + miPunto.getCoordenadaX()); 
        System.out.println("Coordenada Y: " + miPunto.getCoordenadaY()); 
    }
}


/*
Coordenada X: 2.5
Coordenada Y: 3.0
*/
 

