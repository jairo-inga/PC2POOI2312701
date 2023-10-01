package otros;

public class Pelota {
    private float tamaño;
    private String color;

    public Pelota() {
        // Constructor por defecto
    }

    public Pelota(float tamaño, String color) {
        this.tamaño = tamaño;
        this.color = color;
    }

    public float getTamaño() {
        return tamaño;
    }

    public static void main(String[] args) {
        Pelota miPelota = new Pelota(5.0f, "roja");
        System.out.println("Tamaño de la pelota: " + miPelota.getTamaño() + " cm");
        System.out.println("Color de la pelota: " + miPelota.color);
    }
}


/*
 Tamaño de la pelota: 5.0 cm
Color de la pelota: roja
*/
