package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase VideoMusical que hereda de ContenidoAudiovisual
public class VideoMusical extends ContenidoAudiovisual {

    // Atributos propios
    private String artistaPrincipal;
    private String selloDiscografico;
    private int anioLanzamiento;

    // Conexion con la clase Actor
    private List<Actor> actoresParticipantes;

    // Constructor
    public VideoMusical(String titulo, int duracionEnMinutos,
                        String genero, String artistaPrincipal,
                        String selloDiscografico, int anioLanzamiento) {

        super(titulo, duracionEnMinutos, genero);

        this.artistaPrincipal = artistaPrincipal;
        this.selloDiscografico = selloDiscografico;
        this.anioLanzamiento = anioLanzamiento;

        this.actoresParticipantes = new ArrayList<>();
    }

    // Getters y setters
    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(String artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    // Agregar un actor participante
    public void agregarActorParticipante(Actor actor) {

        if (actor != null && !actoresParticipantes.contains(actor)) {
            actoresParticipantes.add(actor);
        }
    }

    // Eliminar un actor participante
    public void eliminarActorParticipante(Actor actor) {
        actoresParticipantes.remove(actor);
    }

    // Obtener los actores participantes
    public List<Actor> getActoresParticipantes() {
        return new ArrayList<>(actoresParticipantes);
    }

    // Metodo para mostrar los detalles
    @Override
    public void mostrarDetalles() {

        System.out.println("DETALLES DEL VIDEO MUSICAL");

        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());

        System.out.println("Artista principal: " + artistaPrincipal);
        System.out.println("Sello discografico: " + selloDiscografico);
        System.out.println("Anio de lanzamiento: " + anioLanzamiento);

        System.out.println("\nActores participantes:");

        if (actoresParticipantes.isEmpty()) {

            System.out.println("No hay participantes registrados.");

        } else {

            for (Actor actor : actoresParticipantes) {

                actor.mostrarInformacion();

                System.out.println("-------------------------");
            }
        }

        System.out.println();
    }
}