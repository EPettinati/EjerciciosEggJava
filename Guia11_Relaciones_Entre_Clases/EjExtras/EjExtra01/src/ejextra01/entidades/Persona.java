package ejextra01.entidades;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private byte edad;
    private int documento;
    private List<Perro> perros;

    public Persona() {
        perros = new ArrayList<>();
    }

    public Persona(String nombre, String apellido, byte edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        perros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    public void adoptarPerro(Perro perro) {
        perros.add(perro);
        perro.setAdoptante(this);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" ").append(apellido).append(", ").append(edad).append(" años, DNI: ").append(documento).append(", Adoptó a:");
        if (perros.isEmpty()) {
            sb.append(" Ningún perro");
        } else {
            for (Perro perro : perros) {
                sb.append("\n- ").append(perro);
            }
        }
        return sb.toString();
    }
}