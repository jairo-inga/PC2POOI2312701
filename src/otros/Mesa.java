package otros;

public class Mesa {
    private float ancho;
    private float altura;
    private String color;
    private String material;
    private String forma;

    public Mesa(float ancho, float altura, String color, String material, String forma) {
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        this.material = material;
        this.forma = forma;
    }

    public String getMaterial() {
        return material;
    }

    public String getForma() {
        return forma;
    }

    public static void main(String[] args) {
        Mesa miMesa = new Mesa(120.5f, 75.0f, "Marrón", "Madera", "Rectangular");
        System.out.println("Ancho de la mesa: " + miMesa.ancho + " cm");
        System.out.println("Altura de la mesa: " + miMesa.altura + " cm");
        System.out.println("Color de la mesa: " + miMesa.color);
        System.out.println("Material de la mesa: " + miMesa.getMaterial());
        System.out.println("Forma de la mesa: " + miMesa.getForma());
    }
}

/*
Ancho de la mesa: 120.5 cm
Altura de la mesa: 75.0 cm
Color de la mesa: Marrón
Material de la mesa: Madera
Forma de la mesa: Rectangular
*/
