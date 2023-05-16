package Entidades;

public class EntidadesIntegrador {
    private String nombre;
    private byte nota;

    public EntidadesIntegrador() {
    }

    public EntidadesIntegrador(String nombre, byte nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getNota() {
        return nota;
    }

    public void setNota(byte nota) {
        this.nota = nota;
    }
    
}
