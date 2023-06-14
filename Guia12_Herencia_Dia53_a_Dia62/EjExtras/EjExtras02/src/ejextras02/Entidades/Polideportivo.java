package ejextras02.Entidades;

public final class Polideportivo extends Edificio {

    private String nombre;
    private String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion) {
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public Polideportivo(String nombre, String instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }    

    public String getTipoInstalacion() {
        return instalacion;
    }
    
    @Override
    public double calcularSuperficie() {
        double superficie = 2 * (ancho * largo + ancho * alto + largo * alto);
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho * alto * largo;
        return volumen;
    }
}