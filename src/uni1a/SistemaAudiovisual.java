
package uni1a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAudiovisual {

    // Herramienta para leer los datos ingresados por teclado
    private static Scanner entrada = new Scanner(System.in);

    // Lista que tiene todos los contenidos audiovisuales
    private static List<ContenidoAudiovisual> contenidos =
            new ArrayList<>();

    // Metodo principal
    public static void main(String[] args) {

        int opcion;

        do {

            mostrarMenu();

            opcion = leerEntero("Seleccione una opcion: ");

            switch (opcion) {

                case 1:
                    registrarPelicula();
                    break;

                case 2:
                    registrarSerie();
                    break;

                case 3:
                    registrarDocumental();
                    break;

                case 4:
                    registrarVideoMusical();
                    break;

                case 5:
                    registrarConferencia();
                    break;

                case 6:
                    mostrarContenidos();
                    break;

                case 7:
                    buscarContenido();
                    break;

                case 8:
                    eliminarContenido();
                    break;

                case 0:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }


    // MUESTRA EL MENU PRINCIPAL
   

    private static void mostrarMenu() {

        System.out.println("\n======================================");
        System.out.println("     SISTEMA DE GESTION AUDIOVISUAL");
        System.out.println("======================================");
        System.out.println("1. Registrar pelicula");
        System.out.println("2. Registrar serie de television");
        System.out.println("3. Registrar documental");
        System.out.println("4. Registrar video musical");
        System.out.println("5. Registrar conferencia cientifica");
        System.out.println("6. Mostrar todos los contenidos");
        System.out.println("7. Buscar contenido por ID");
        System.out.println("8. Eliminar un contenido");
        System.out.println("0. Salir");
        System.out.println("======================================");
    }

    
    // REGISTRA PELICULA Y SUS ACTORES
   

    private static void registrarPelicula() {

        System.out.println("\n--- REGISTRO DE PELICULA ---");

        String titulo = leerTexto("Titulo: ");
        int duracion = leerPositivo("Duracion en minutos: ");
        String genero = leerTexto("Genero: ");
        String estudio = leerTexto("Estudio cinematografico: ");

        Pelicula pelicula = new Pelicula(
                titulo, duracion, genero, estudio
        );

        int cantidad = leerCantidad("Cantidad de actores: ");

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nDatos del actor " + (i + 1));

            String nombre = leerTexto("Nombre: ");
            String nacionalidad = leerTexto("Nacionalidad: ");
            int edad = leerPositivo("Edad: ");

            Actor actor = new Actor(nombre, nacionalidad, edad);

            pelicula.agregarActor(actor);
        }

        contenidos.add(pelicula);

        System.out.println("\nPelicula registrada correctamente.");
        System.out.println("ID asignado: " + pelicula.getId());
    }

  
    // REGISTRA SERIE Y SUS TEMPORADAS


    private static void registrarSerie() {

        System.out.println("\n--- REGISTRO DE SERIE ---");

        String titulo = leerTexto("Titulo: ");
        int duracion = leerPositivo("Duracion en minutos: ");
        String genero = leerTexto("Genero: ");

        SerieDeTV serie = new SerieDeTV(
                titulo, duracion, genero
        );

        int cantidad = leerCantidad("Cantidad de temporadas: ");

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nDatos de la temporada " + (i + 1));

            int numero = leerPositivo("Numero de temporada: ");
            int anio = leerPositivo("Año de estreno: ");
            int episodios = leerPositivo("Numero de episodios: ");

            serie.agregarTemporada(numero, anio, episodios);
        }

        contenidos.add(serie);

        System.out.println("\nSerie registrada correctamente.");
        System.out.println("ID asignado: " + serie.getId());
    }

   
    // REGISTRA DOCUMENTAL Y SUS INVESTIGADORES


    private static void registrarDocumental() {

        System.out.println("\n--- REGISTRO DE DOCUMENTAL ---");

        String titulo = leerTexto("Titulo: ");
        int duracion = leerPositivo("Duracion en minutos: ");
        String genero = leerTexto("Genero: ");
        String tema = leerTexto("Tema del documental: ");

        Documental documental = new Documental(
                titulo, duracion, genero, tema
        );

        int cantidad = leerCantidad("Cantidad de investigadores: ");

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nDatos del investigador " + (i + 1));

            String nombre = leerTexto("Nombre: ");
            String especialidad = leerTexto("Especialidad: ");
            String institucion = leerTexto("Institucion: ");

            Investigador investigador = new Investigador(
                    nombre, especialidad, institucion
            );

            documental.agregarInvestigador(investigador);
        }

        contenidos.add(documental);

        System.out.println("\nDocumental registrado correctamente.");
        System.out.println("ID asignado: " + documental.getId());
    }


    // REGISTRA EL VIDEO MUSICAL Y SUS ACTORES
 

    private static void registrarVideoMusical() {

        System.out.println("\n--- REGISTRO DE VIDEO MUSICAL ---");

        String titulo = leerTexto("Titulo: ");
        int duracion = leerPositivo("Duracion en minutos: ");
        String genero = leerTexto("Genero musical: ");
        String artista = leerTexto("Artista principal: ");
        String sello = leerTexto("Sello discografico: ");
        int anio = leerPositivo("Año de lanzamiento: ");

        VideoMusical video = new VideoMusical(
                titulo, duracion, genero, artista, sello, anio
        );

        int cantidad = leerCantidad("Cantidad de actores participantes: ");

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nDatos del participante " + (i + 1));

            String nombre = leerTexto("Nombre: ");
            String nacionalidad = leerTexto("Nacionalidad: ");
            int edad = leerPositivo("Edad: ");

            Actor actor = new Actor(nombre, nacionalidad, edad);

            video.agregarActorParticipante(actor);
        }

        contenidos.add(video);

        System.out.println("\nVideo musical registrado correctamente.");
        System.out.println("ID asignado: " + video.getId());
    }

 
    // REGISTRA LA CONFERENCIA Y SUS INVESTIGADORES


    private static void registrarConferencia() {

        System.out.println("\n--- REGISTRO DE CONFERENCIA CIENTIFICA ---");

        String titulo = leerTexto("Titulo: ");
        int duracion = leerPositivo("Duracion en minutos: ");
        String genero = leerTexto("Genero: ");
        String tema = leerTexto("Tema central: ");
        String institucion = leerTexto("Institucion organizadora: ");
        String fecha = leerTexto("Fecha de realizacion: ");
        String modalidad = leerTexto("Modalidad: ");

        ConferenciaCientifica conferencia =
                new ConferenciaCientifica(
                        titulo, duracion, genero, tema,
                        institucion, fecha, modalidad
                );

        int cantidad = leerCantidad("Cantidad de investigadores: ");

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nDatos del investigador " + (i + 1));

            String nombre = leerTexto("Nombre: ");
            String especialidad = leerTexto("Especialidad: ");
            String institucionInvestigador =
                    leerTexto("Institucion del investigador: ");

            Investigador investigador = new Investigador(
                    nombre, especialidad, institucionInvestigador
            );

            conferencia.agregarInvestigador(investigador);
        }

        contenidos.add(conferencia);

        System.out.println("\nConferencia registrada correctamente.");
        System.out.println("ID asignado: " + conferencia.getId());
    }

 
    // MUESTRA TODOS LOS CONTENIDOS DISPONIBLES


    private static void mostrarContenidos() {

        System.out.println("\n--- LISTADO DE CONTENIDOS AUDIOVISUALES ---");

        if (contenidos.isEmpty()) {

            System.out.println("No existen contenidos registrados.");

            return;
        }

        for (ContenidoAudiovisual contenido : contenidos) {

            contenido.mostrarDetalles();

            System.out.println("======================================");
        }
    }


    // BUSCA CONTENIDO POR MEDIO DE SU ID
  

    private static void buscarContenido() {

        System.out.println("\n--- BUSCAR CONTENIDO ---");

        int id = leerEntero("Ingrese el ID del contenido: ");

        ContenidoAudiovisual contenido = localizarContenido(id);

        if (contenido != null) {

            System.out.println("\nContenido encontrado:");

            contenido.mostrarDetalles();

        } else {

            System.out.println("No se encontro un contenido con ese ID.");
        }
    }


    // ELIMINA CONTENIDO POR MEDIO DE  SU ID


    private static void eliminarContenido() {

        System.out.println("\n--- ELIMINAR CONTENIDO ---");

        int id = leerEntero("Ingrese el ID del contenido: ");

        ContenidoAudiovisual contenido = localizarContenido(id);

        if (contenido != null) {

            contenidos.remove(contenido);

            System.out.println("Contenido eliminado correctamente.");

        } else {

            System.out.println("No se encontro un contenido con ese ID.");
        }
    }


    // LOCALIZA UN CONTENIDO

    private static ContenidoAudiovisual localizarContenido(int id) {

        for (ContenidoAudiovisual contenido : contenidos) {

            if (contenido.getId() == id) {

                return contenido;
            }
        }

        return null;
    }

   
    private static String leerTexto(String mensaje) {

        String texto;

        do {

            System.out.print(mensaje);
            texto = entrada.nextLine().trim();

            if (texto.isEmpty()) {
                System.out.println("Este campo no puede estar vacio.");
            }

        } while (texto.isEmpty());

        return texto;
    }

    

    private static int leerEntero(String mensaje) {

        while (true) {

            System.out.print(mensaje);

            String texto = entrada.nextLine();

            try {

                return Integer.parseInt(texto.trim());

            } catch (NumberFormatException e) {

                System.out.println("Ingrese un numero entero valido.");
            }
        }
    }

    

    private static int leerPositivo(String mensaje) {

        int numero;

        do {

            numero = leerEntero(mensaje);

            if (numero <= 0) {
                System.out.println("El valor debe ser mayor que cero.");
            }

        } while (numero <= 0);

        return numero;
    }

   

    private static int leerCantidad(String mensaje) {

        int cantidad;

        do {

            cantidad = leerEntero(mensaje);

            if (cantidad < 0) {
                System.out.println("La cantidad no puede ser negativa.");
            }

        } while (cantidad < 0);

        return cantidad;
    }
}
