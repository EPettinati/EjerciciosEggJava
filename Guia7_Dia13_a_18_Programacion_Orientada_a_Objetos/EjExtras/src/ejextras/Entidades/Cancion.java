package ejextras.Entidades;

public class Cancion {
    private String autro;
    private String titulo;

    public Cancion() {
        this.autro = "";
        this.titulo = "";
    }

    public Cancion(String autro, String titulo) {
        this.autro = autro;
        this.titulo = titulo;
    }

    public String getAutro() {
        return autro;
    }

    public void setAutro(String autro) {
        this.autro = autro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
