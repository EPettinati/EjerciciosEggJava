package ejextra01.entidades;

public class Perro {
    private String nombre;
    private String raza;
    private byte edad;
    private float tamano;
    private Persona adoptante;

    public Perro() {
    }

    public Perro(String nombre, String raza, byte edad, float tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.adoptante = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public Persona getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Persona adoptante) {
        this.adoptante = adoptante;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + " años, Tamaño: " + tamano;
    }
}