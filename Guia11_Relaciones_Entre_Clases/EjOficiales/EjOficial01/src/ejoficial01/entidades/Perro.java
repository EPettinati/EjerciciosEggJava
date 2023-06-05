package ejoficial01.entidades;

public class Perro {
    private String nombre;
    private String raza;
    private byte edad;
    private float tamano;

    public Perro() {
    }

    public Perro(String nombre, String raza, byte edad, float tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
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

    @Override
    public String toString() {
        return "y su nombre es: " + nombre + ", de la raza " + raza + ", tiene " + edad + " años, y mide " + tamano + '}';
    }
}
