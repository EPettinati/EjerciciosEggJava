package ejextras04.Entidades;

public class Empleado extends Persona {

    protected int anioIncorporacion;
    protected String numeroDespacho;

    public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int anioIncorporacion, String numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Año de incorporación: " + anioIncorporacion);
        System.out.println("Número de despacho: " + numeroDespacho);
    }
}