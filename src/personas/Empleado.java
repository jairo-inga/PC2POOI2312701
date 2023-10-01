package personas;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado() {
        // Constructor por defecto
    }

    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public int getSalarioAnual() {
        return salario * 12;
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan", "Pérez", 50000);
        Empleado empleado2 = new Empleado(2, "María", "Gómez", 60000);

        System.out.println("Salario mensual de " + empleado1.nombre + ": $" + empleado1.getSalario());
        System.out.println("Salario anual de " + empleado1.nombre + ": $" + empleado1.getSalarioAnual());

        System.out.println("Salario mensual de " + empleado2.nombre + ": $" + empleado2.getSalario());
        System.out.println("Salario anual de " + empleado2.nombre + ": $" + empleado2.getSalarioAnual());
    }
}

/*
Salario mensual de Juan: $50000
Salario anual de Juan: $600000
Salario mensual de María: $60000
Salario anual de María: $720000
*/

