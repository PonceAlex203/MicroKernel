package unicauca.edu.co.entities;

public class Project {

    private String id;
    private String nombre;
    private String fechaFormatoA;
    private String estudiante1;
    private String estudiante2; 
    private String profesor;
    private String tipo;
    private String programa;

    public Project(String id, String nombre, String fechaFormatoA,
            String estudiante1, String estudiante2,
            String profesor, String tipo, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.fechaFormatoA = fechaFormatoA;
        this.estudiante1 = estudiante1;
        this.estudiante2 = estudiante2;
        this.profesor = profesor;
        this.tipo = tipo;
        this.programa = programa;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaFormatoA() {
        return fechaFormatoA;
    }

    public String getEstudiante1() {
        return estudiante1;
    }

    public String getEstudiante2() {
        return estudiante2;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrograma() {
        return programa;
    }
}
