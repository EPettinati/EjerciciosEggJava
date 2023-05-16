package ejoficiales.Entidades;

import java.util.ArrayList;
import java.util.List;

public class AlumnoEntidad03 {
    private String nombre;
    private List<Integer> notas;

    public AlumnoEntidad03(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public AlumnoEntidad03() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public static double calcularPromedio(ArrayList<Integer> notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.size();
    }
}
