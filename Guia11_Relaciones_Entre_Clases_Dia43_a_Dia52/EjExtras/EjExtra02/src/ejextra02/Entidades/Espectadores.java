package ejextra02.Entidades;

public class Espectadores {
    private String nombre;
    private int edad;
    private float dineroDisp;

    public Espectadores() {
    }

    public Espectadores(String nombre, int edad, float dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

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

    public float getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(float dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

}

