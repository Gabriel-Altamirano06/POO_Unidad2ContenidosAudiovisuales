package uni1a;

// Clase que representa a un investigador
public class Investigador {

    // Atributos
    private String nombre;
    private String especialidad;
    private String institucion;

    // Constructor
    public Investigador(String nombre, String especialidad,
                        String institucion) {

        this.nombre = nombre;
        this.especialidad = especialidad;
        this.institucion = institucion;
    }

    // Getter y Setter del nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de la especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Getter y Setter de la institucion
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    // Metodo para mostrar la informacion
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Institucion: " + institucion);
    }
}