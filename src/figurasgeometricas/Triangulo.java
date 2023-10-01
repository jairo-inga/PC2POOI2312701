package figurasgeometricas;

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
        return Math.sqrt(Math.pow((punto2.getCoordenadaX() - punto1.getCoordenadaX()), 2) +
                Math.pow((punto2.getCoordenadaY() - punto1.getCoordenadaY()), 2));
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(4, 0);
        Punto punto3 = new Punto(2, 3);

        Triangulo miTriangulo = new Triangulo(punto1, punto2, punto3);
        System.out.println("Perímetro: " + miTriangulo.getPerimetro());
        System.out.println("Tipo: " + miTriangulo.getTipo()); 
    }

    static class Punto {
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
    }
}

/*
Perímetro: 11.21110255092798
Tipo: Isósceles
*/