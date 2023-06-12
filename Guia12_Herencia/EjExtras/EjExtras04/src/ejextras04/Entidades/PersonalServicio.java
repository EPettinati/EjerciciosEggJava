package ejextras04.Entidades;

public class PersonalServicio extends Empleado {
    protected String seccionAsignada;

    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int anioIncorporacion, String numeroDespacho, String seccionAsignada) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho);
        this.seccionAsignada = seccionAsignada;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccionAsignada = nuevaSeccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección asignada: " + seccionAsignada);
    }
}