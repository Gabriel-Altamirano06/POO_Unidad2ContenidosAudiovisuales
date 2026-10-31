package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {

    private String tema;

    // Agregacion con la clase Investigador
    private List<Investigador> investigadores;

    // Constructor
    public Documental(String titulo, int duracionEnMinutos,
                      String genero, String tema) {

        super(titulo, duracionEnMinutos, genero);

        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    // Getter y Setter del tema
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // Agregar un investigador al documental
    public void agregarInvestigador(Investigador investigador) {

        if (investigador != null && !investigadores.contains(investigador)) {
            investigadores.add(investigador);
        }
    }

    // Eliminar un investigador del documental
    public void eliminarInvestigador(Investigador investigador) {

        investigadores.remove(investigador);
    }

    // Obtener los investigadores del documental
    public List<Investigador> getInvestigadores() {

        return new ArrayList<>(investigadores);
    }

    // Mostrar los detalles del documental
    @Override
    public void mostrarDetalles() {

        System.out.println("Detalles del documental:");

        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: "
                + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Tema: " + tema);

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