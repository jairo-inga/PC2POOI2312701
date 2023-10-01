package animales;

public class Perro {
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getTipoRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro("Max", "Labrador", "Dorado", 5);
        System.out.println("Nombre del perro: " + miPerro.nombre);
        System.out.println("Raza del perro: " + miPerro.getTipoRaza());
        System.out.println("Color del perro: " + miPerro.color);
        System.out.println("Edad del perro: " + miPerro.getEdad() + " años");
    }
}
