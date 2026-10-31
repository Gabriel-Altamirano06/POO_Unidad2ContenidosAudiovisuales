package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase ConferenciaCientifica que hereda de ContenidoAudiovisual
public class ConferenciaCientifica extends ContenidoAudiovisual {

    // Atributos propios
    private String temaCentral;
    private String institucionOrganizadora;
    private String fechaRealizacion;
    private String modalidad;

    // Adicion con la clase Investigador
    private List<Investigador> investigadores;

    // Constructor
    public ConferenciaCientifica(String titulo, int duracionEnMinutos,
                                 String genero, String temaCentral,
                                 String institucionOrganizadora,
                                 String fechaRealizacion, String modalidad) {

        super(titulo, duracionEnMinutos, genero);

        this.temaCentral = temaCentral;
        this.institucionOrganizadora = institucionOrganizadora;
        this.fechaRealizacion = fechaRealizacion;
        this.modalidad = modalidad;

        this.investigadores = new ArrayList<>();
    }

    // Getters y setters
    public String getTemaCentral() {
        return temaCentral;
    }

    public void setTemaCentral(String temaCentral) {
        this.temaCentral = temaCentral;
    }

    public String getInstitucionOrganizadora() {
        return institucionOrganizadora;
    }

    public void setInstitucionOrganizadora(String institucionOrganizadora) {
        this.institucionOrganizadora = institucionOrganizadora;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    // Agregar un investigador
    public void agregarInvestigador(Investigador investigador) {

        if (investigador != null && !investigadores.contains(investigador)) {
            investigadores.add(investigador);
        }
    }

    // Eliminar un investigador
    public void eliminarInvestigador(Investigador investigador) {

        investigadores.remove(investigador);
    }

    // Obtener los investigadores
    public List<Investigador> getInvestigadores() {

        return new ArrayList<>(investigadores);
    }

    // Metodo para mostrar los detalles
    @Override
    public void mostrarDetalles() {

        System.out.println("DETALLES DE LA CONFERENCIA CIENTIFICA");

        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());

        System.out.println("Tema central: " + temaCentral);
        System.out.println("Institucion organizadora: "
                + institucionOrganizadora);
        System.out.println("Fecha de realizacion: " + fechaRealizacion);
        System.out.println("Modalidad: " + modalidad);

        System.out.println("\nInvestigadores participantes:");

        if (investigadores.isEmpty()) {

            System.out.println("No hay investigadores registrados.");

        } else {

            for (Investigador investigador : investigadores) {

                investigador.mostrarInformacion();

                System.out.println("-------------------------");
            }
        }

        System.out.println();
    }
}