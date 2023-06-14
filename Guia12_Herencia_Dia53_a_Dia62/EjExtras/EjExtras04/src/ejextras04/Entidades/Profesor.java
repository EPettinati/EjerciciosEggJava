
package ejextras04.Entidades;

public class Profesor extends Empleado {
    protected String departamento;

    public Profesor(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int anioIncorporacion, String numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Departamento: " + departamento);
    }
}
