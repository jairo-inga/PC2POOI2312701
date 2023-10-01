package otros;

public class Celular {
    private int numero;
    private String marca;
    private String color;
    private String modelo;
    private String plan;

    public Celular(int numero, String marca, String color, String modelo, String plan) {
        this.numero = numero;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.plan = plan;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Celular miCelular = new Celular(123456789, "Samsung", "Negro", "Galaxy S21", "Plan Premium");

        System.out.println("Número del celular: " + miCelular.numero);
        System.out.println("Marca del celular: " + miCelular.getMarca());
        System.out.println("Color del celular: " + miCelular.color);
        System.out.println("Modelo del celular: " + miCelular.getModelo());
        System.out.println("Plan del celular: " + miCelular.plan);
    }
}

/*
Número del celular: 123456789
Marca del celular: Samsung
Color del celular: Negro
Modelo del celular: Galaxy S21
Plan del celular: Plan Premium
*/
