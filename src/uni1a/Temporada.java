package uni1a;

// Clase que representa una temporada de una serie
public class Temporada {

    // Atributos
    private int numeroTemporada;
    private int anioEstreno;
    private int numeroEpisodios;

    // Constructor
    public Temporada(int numeroTemporada, int anioEstreno,
                     int numeroEpisodios) {

        this.numeroTemporada = numeroTemporada;
        this.anioEstreno = anioEstreno;
        this.numeroEpisodios = numeroEpisodios;
    }

    // Getter y Setter del numero de temporadas
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    // Getter y Setter del año de estreno
    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    // Getter y Setter del numero de episodios
    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    // Metodo para mostrar la informacion
    public void mostrarInformacion() {

        System.out.println("Numero de temporada: " + numeroTemporada);
        System.out.println("Año de estreno: " + anioEstreno);
        System.out.println("Numero de episodios: " + numeroEpisodios);
    }
}