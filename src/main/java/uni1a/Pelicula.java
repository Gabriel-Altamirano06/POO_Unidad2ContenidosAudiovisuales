package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {

    private String estudio;

    // Conexion con la clase Actor
    private List<Actor> actores;

    // Constructor
    public Pelicula(String titulo, int duracionEnMinutos,
                    String genero, String estudio) {

        super(titulo, duracionEnMinutos, genero);

        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    // Agregar un actor a la pelicula
    public void agregarActor(Actor actor) {
        if (actor != null && !actores.contains(actor)) {
            actores.add(actor);
        }
    }

    // Eliminar un actor de la pelicula
    public void eliminarActor(Actor actor) {
        actores.remove(actor);
    }

    // Obtener los actores de la pelicula
    public List<Actor> getActores() {
        return new ArrayList<>(actores);
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);

        System.out.println("Actores participantes:");

        if (actores.isEmpty()) {
            System.out.println("No hay actores registrados.");
        } else {
            for (Actor actor : actores) {
                actor.mostrarInformacion();
                System.out.println("--------------------");
            }
        }

        System.out.println();
    }
}