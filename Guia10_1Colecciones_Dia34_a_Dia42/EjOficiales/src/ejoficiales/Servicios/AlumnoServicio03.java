package ejoficiales.Servicios;

import java.util.Scanner;
import ejoficiales.Entidades.AlumnoEntidad03;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlumnoServicio03 {

    AlumnoEntidad03 a = new AlumnoEntidad03();
    List<AlumnoEntidad03> listaAlumno = new ArrayList();

    public AlumnoEntidad03 crearAlumno() {
        Scanner sc = new Scanner(System.in);
    List<Integer> notas = new ArrayList<>();
        Random r = new Random();

        System.out.println("Ingrese el nombre del alumno.");
        a.setNombre(sc.nextLine());

        System.out.println("Se ingresaran las notas de forma automatica.");
        for (int i = 0; i < 3; i++) {
            int nota = r.nextInt(11);
            notas.add(nota);
            System.out.println("La " + (i + 1) + " nota es: " + nota);
        }
        a.setNotas(notas);

        AlumnoEntidad03 alumno = new AlumnoEntidad03(a.getNombre(), notas);
        listaAlumno.add(alumno);

        return alumno;
    }

    public double notaFinal(String nombreAlumno) {
        for (AlumnoEntidad03 alumno : listaAlumno) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> nota = alumno.getNotas();
                return alumno.calcularPromedio((ArrayList<Integer>) nota);
            }
        }
        return 0.0;
    }
}
