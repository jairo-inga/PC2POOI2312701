package otros;

public class Automovil {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String tipo;

    public Automovil(String placa, String marca, String modelo, String color, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public static void main(String[] args) {
        Automovil miAutomovil = new Automovil("ABC123", "Toyota", "Corolla", "Rojo", "Sedán");
        System.out.println("Placa del automóvil: " + miAutomovil.placa);
        System.out.println("Marca del automóvil: " + miAutomovil.getMarca());
        System.out.println("Modelo del automóvil: " + miAutomovil.getModelo());
        System.out.println("Color del automóvil: " + miAutomovil.color);
        System.out.println("Tipo del automóvil: " + miAutomovil.tipo);
    }
}

/*
Placa del automóvil: ABC123
Marca del automóvil: Toyota
Modelo del automóvil: Corolla
Color del automóvil: Rojo
Tipo del automóvil: Sedán
*/
