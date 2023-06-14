package ejoficiales02.entidades;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador" + id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverAgua r) {
        System.out.println(nombre + " se apunta y aprieta el gatillo...");
        if (r.mojar()) {
            System.out.println(nombre + " se ha mojado.");
            mojado = true;
            return true;
        } else {
            System.out.println(nombre + " se salva.");
            r.siguienteChorro();
            return false;
        }
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}