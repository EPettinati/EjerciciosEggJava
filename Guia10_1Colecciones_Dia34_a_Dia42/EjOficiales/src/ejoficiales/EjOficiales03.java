package ejoficiales;

import ejoficiales.Servicios.AlumnoServicio03;
import ejoficiales.Entidades.AlumnoEntidad03;
import java.util.ArrayList;
import java.util.Scanner;

public class EjOficiales03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlumnoServicio03 servicioAlumno = new AlumnoServicio03();
        ArrayList<AlumnoEntidad03> listaAlumnos = new ArrayList<>();
        
        String rep;

        do {
            AlumnoEntidad03 alumno = servicioAlumno.crearAlumno();
            listaAlumnos.add(alumno);

            System.out.println("¿Quieres seguir agregando alumnos? S/N");
            rep = sc.nextLine();
        } while (rep.equalsIgnoreCase("s"));

        System.out.println("Ingrese el nombre del alumno al que desea calcularle el promedio final:");
        String nombre = sc.nextLine();

        double promedioFinal = servicioAlumno.notaFinal(nombre);
        if (promedioFinal != 0.0) {
            System.out.println("El promedio final de " + nombre + " es: " + promedioFinal);
        } else {
            System.out.println("Alumno no encontrado en la lista.");
        }
    }
}
