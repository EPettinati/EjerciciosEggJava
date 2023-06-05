package ejextra02.Entidades;

public class Pelicula {
    private String titulo;
    private int duracion;
    private byte edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, byte edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public byte getEdadMinima() {
        return 18;
    }

    public void setEdadMinima(byte edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}