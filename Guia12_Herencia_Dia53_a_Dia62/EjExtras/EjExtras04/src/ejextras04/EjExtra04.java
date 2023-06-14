package ejextras04;

import ejextras04.Entidades.Estudiante;
import ejextras04.Entidades.PersonalServicio;
import ejextras04.Entidades.Profesor;

public class EjExtra04 {

    public static void main(String[] args) {
        // Crear objetos de diferentes tipos
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "123456789", "Soltero/a", "4º curso");
        Profesor profesor = new Profesor("María", "González", "987654321", "Casado/a", 2015, "D123", "Lenguajes");
        PersonalServicio personalServicio = new PersonalServicio("Pedro", "López", "456789123", "Soltero/a", 2010, "A456", "Biblioteca");

        // Imprimir información de los objetos
        estudiante.imprimirInformacion();
        System.out.println();
        profesor.imprimirInformacion();
        System.out.println();
        personalServicio.imprimirInformacion();
        System.out.println();
        
        // Realizar operaciones en los objetos
        estudiante.cambiarEstadoCivil("Casado/a");
        profesor.reasignarDespacho("D234");
        estudiante.matricularEnCurso("5º curso");
        profesor.cambiarDepartamento("Matematica");
        personalServicio.trasladarSeccion("Secretaría");

        // Imprimir información de los objetos
        estudiante.imprimirInformacion();
        System.out.println();
        profesor.imprimirInformacion();
        System.out.println();
        personalServicio.imprimirInformacion();
    }
}
