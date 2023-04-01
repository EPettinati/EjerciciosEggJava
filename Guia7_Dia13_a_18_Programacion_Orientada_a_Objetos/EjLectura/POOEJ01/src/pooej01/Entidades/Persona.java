package pooej01.Entidades;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor sin argumentos
    public Persona() {
        nombre = "Desconocido";
        edad = 0;
    }

    // Constructor con argumentos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}