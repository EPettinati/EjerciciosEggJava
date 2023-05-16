package integradorjava01;

import Servicios.ServiciosIntegrador;
import java.util.Scanner;

public class IntegradorJava01 {

    public static void main(String[] args) {
        ServiciosIntegrador n = new ServiciosIntegrador();
        Scanner sc = new Scanner(System.in);
        byte[] notaAlum = new byte[5];
        String[] nomAlum = new String[notaAlum.length];
        byte promGen = 0;

        for (int i = 0; i < notaAlum.length; i++) {
            n.Integrador();
            promGen += n.calcularPromedio();
            notaAlum[i] = n.calcularPromedio();
            nomAlum[i] = n.pasarNombres();
        }

        System.out.println("El promedio general es: " + (promGen / notaAlum.length));

        for (int i = 0; i < notaAlum.length; i++) {
            if (notaAlum[i] >= (promGen / notaAlum.length)) {
                System.out.println("El alumno " + nomAlum[i] + " está sobre el promedio. Con: " + notaAlum[i]);
            }
        }
    }
}
