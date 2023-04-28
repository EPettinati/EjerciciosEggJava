package ejextras.Entidades;

public class Cancion {
    // Atributos de la clase Cancion
    private String autor; // Autor de la canción
    private String titulo; // Título de la canción

    // Constructor vacío de la clase Cancion
    public Cancion() {
        this.autor = ""; // Asigna una cadena vacía al atributo autor de la canción
        this.titulo = ""; // Asigna una cadena vacía al atributo titulo de la canción
    }

    // Constructor de la clase Cancion
    public Cancion(String autor, String titulo) {
        this.autor = autor; // Asigna el autor pasado como parámetro al atributo autor de la canción
        this.titulo = titulo; // Asigna el título pasado como parámetro al atributo título de la canción
    }

    // Método getter para el atributo autor
    public String getAutor() {
        return autor; // Retorna el autor de la canción
    }

    // Método setter para el atributo autor
    public void setAutor(String autor) {
        this.autor = autor; // Asigna el valor pasado como parámetro al atributo autor de la canción
    }

    // Método getter para el atributo titulo
    public String getTitulo() {
        return titulo; // Retorna el título de la canción
    }

    // Método setter para el atributo titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo; // Asigna el valor pasado como parámetro al atributo título de la canción
    }
}