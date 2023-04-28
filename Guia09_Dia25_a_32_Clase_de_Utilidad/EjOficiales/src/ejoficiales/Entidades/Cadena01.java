package ejoficiales.Entidades;

public class Cadena01 {
    private String frase;
    private int longitud;

    public Cadena01() {
    }

    public Cadena01(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
