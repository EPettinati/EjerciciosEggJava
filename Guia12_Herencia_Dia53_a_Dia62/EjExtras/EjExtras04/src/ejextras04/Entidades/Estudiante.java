package ejextras04.Entidades;

public class Estudiante extends Persona {
    protected String cursoMatriculado;

    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, String cursoMatriculado) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public void matricularEnCurso(String nuevoCurso) {
        this.cursoMatriculado = nuevoCurso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso matriculado: " + cursoMatriculado);
    }
}