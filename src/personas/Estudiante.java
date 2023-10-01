package personas;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private float calificacion;

    public Estudiante(int id, String nombre, String apellido, int edad, String curso, float calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public float getNota() {
        return calificacion;
    }

    public String getCurso() {
        return curso;
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Pérez", 18, "Matemáticas", 9.5f);
        Estudiante estudiante2 = new Estudiante(2, "María", "Gómez", 19, "Historia", 8.7f);

        System.out.println("Estudiante 1:");
        System.out.println("ID: " + estudiante1.id);
        System.out.println("Nombre: " + estudiante1.nombre + " " + estudiante1.apellido);
        System.out.println("Edad: " + estudiante1.edad + " años");
        System.out.println("Curso: " + estudiante1.getCurso());
        System.out.println("Calificación: " + estudiante1.getNota());

        System.out.println("\nEstudiante 2:");
        System.out.println("ID: " + estudiante2.id);
        System.out.println("Nombre: " + estudiante2.nombre + " " + estudiante2.apellido);
        System.out.println("Edad: " + estudiante2.edad + " años");
        System.out.println("Curso: " + estudiante2.getCurso());
        System.out.println("Calificación: " + estudiante2.getNota());
    }
}


/*Estudiante 1:
ID: 1
Nombre: Juan Pérez
Edad: 18 años
Curso: Matemáticas
Calificación: 9.5

Estudiante 2:
ID: 2
Nombre: María Gómez
Edad: 19 años
Curso: Historia
Calificación: 8.7*/
