package figurasgeometricas;

public class circulo {
    private double radio;
    private String color;

    public circulo() {
        this.radio = 1.0;
        this.color = "red";
    }

    public circulo(double radio, String color) {
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
        circulo miCirculo = new circulo(2.5, "blue");
        System.out.println("Radio: " + miCirculo.getRadio()); // Output: Radio: 2.5
        System.out.println("Área: " + miCirculo.getArea());   // Output: Área: 19.634954084936208
        System.out.println("Color: " + miCirculo.color);      // Output: Color: blue
    }
}


/*
Radio: 2.5
Área: 19.634954084936208
Color: blue
*/
