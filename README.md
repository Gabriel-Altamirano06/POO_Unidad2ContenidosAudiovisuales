
# Sistema de Gestión Audiovisual

## 1. Descripción del proyecto

El Sistema de Gestión Audiovisual es una aplicación desarrollada en Java mediante los principios de Programación Orientada a Objetos.

El proyecto permite registrar, organizar, consultar y eliminar diferentes tipos de contenidos audiovisuales, utilizando conceptos como herencia, asociación, agregación, composición y polimorfismo.

Su propósito es representar diferentes producciones audiovisuales y administrar la información de las personas y elementos que participen.

## 2. Objetivos del proyecto

- Aplicar los conceptos de Programación Orientada a Objetos.
- Implementar relaciones entre diferentes clases.
- Utilizar herencia y polimorfismo para organizar los contenidos.
- Desarrollar un sistema funcional que permita administrar información audiovisual.

## 3. Clases del proyecto

### Clases originales

- ContenidoAudiovisual: clase padre que contiene los atributos generales de los contenidos.
- Pelicula: representa las producciones cinematográficas.
- SerieDeTV: representa las series de televisión.
- Documental: representa producciones audiovisuales de carácter documental.

### Clases adicionales

- Actor: almacena información de los actores participantes.
- Temporada: representa las temporadas de una serie.
- Investigador: almacena información de los investigadores participantes.

### Nuevas subclases

- VideoMusical: representa producciones audiovisuales musicales, incluyendo información del artista, sello discográfico y participantes.
- ConferenciaCientifica: representa conferencias científicas y administra información sobre sus temas, instituciones e investigadores.

## 4. Relaciones de Programación Orientada a Objetos

- Herencia: Pelicula, SerieDeTV, Documental, VideoMusical y ConferenciaCientifica heredan de ContenidoAudiovisual.
- Asociación: Pelicula se relaciona con Actor.
- Composición: SerieDeTV administra sus objetos Temporada.
- Agregación: Documental se relaciona con Investigador.
- Asociación: VideoMusical se relaciona con Actor.
- Agregación: ConferenciaCientifica se relaciona con Investigador.

## 5. Funcionalidades del sistema

La aplicación cuenta con un menú de consola que permite:

1. Registrar películas y sus actores.
2. Registrar series y sus temporadas.
3. Registrar documentales y sus investigadores.
4. Registrar videos musicales y sus participantes.
5. Registrar conferencias científicas y sus investigadores.
6. Mostrar todos los contenidos registrados.
7. Buscar contenidos mediante su identificador.
8. Eliminar contenidos registrados.

También incorpora validaciones para evitar datos vacíos y cantidades negativas en los campos numéricos correspondientes.

## 6. Requisitos

- Java JDK 8.
- Eclipse IDE for Java Developers o un entorno compatible con Java.
- Git (opcional para ejecutar el programa).


## 7. Estructura del proyecto

POO_Unidad2_ContenidosAudiovisuales/
|
|-- src/
|   |-- main/
|       |-- java/
|           |-- uni1a/
|               |-- ContenidoAudiovisual.java
|               |-- Pelicula.java
|               |-- SerieDeTV.java
|               |-- Documental.java
|               |-- Actor.java
|               |-- Temporada.java
|               |-- Investigador.java
|               |-- VideoMusical.java
|               |-- ConferenciaCientifica.java
|               |-- SistemaAudiovisual.java
|
|-- docs/
|-- README.md
|-- .gitignore
|-- .project


## 8. Instalación y ejecución

### Clonar el repositorio

Abrir una terminal y ejecutar:

```git bash
git clone https://github.com/Gabriel_Altamirano06/POO_Unidad2_ContenidosAudiovisuales.git
```

### Importar en Eclipse

1. Abrir Eclipse.
2. Seleccionar File.
3. Seleccionar Import.
4. Elegir General > Existing Projects into Workspace.
5. Seleccionar la carpeta del repositorio clonado.
6. Presionar Finish.

### Ejecutar el sistema

1. Abrir el paquete uni1a.
2. Buscar SistemaAudiovisual.java.
3. Hacer clic derecho sobre el archivo.
4. Seleccionar Run As > Java Application.
5. Utilizar el menú que aparece en la consola.

## 9. Mejoras implementadas

- Organización de las clases mediante herencia.
- Administración de relaciones entre objetos.
- Uso de colecciones ArrayList para gestionar los elementos relacionados.
- Implementación de polimorfismo.
- Validación de datos ingresados por el usuario.
- Búsqueda y eliminación de contenidos por identificador.
- Incorporación de dos nuevas subclases originales.

## 10. Diagrama de clases

El proyecto incluye un diagrama UML que representa las clases originales, las nuevas clases y sus relaciones.

Consultar la carpeta docs para visualizar el diagrama.

## 11. Tecnologías utilizadas

- Lenguaje de programación: Java.
- Entorno de desarrollo: Eclipse IDE.
- Gestión de versiones: Git.
- Repositorio: GitHub.
- Diagramación: diagrams.net (draw.io).
