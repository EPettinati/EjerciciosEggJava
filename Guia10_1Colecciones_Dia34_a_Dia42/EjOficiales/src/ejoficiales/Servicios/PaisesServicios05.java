package ejoficiales.Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class PaisesServicios05 {

    Scanner sc = new Scanner(System.in);
    Set<String> paises = new HashSet<>();

    public void GenerarPaises() {

        String pais;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un país (o 'salir' para finalizar): ");
            pais = sc.nextLine();

            if (pais.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                if (paises.add(pais)) {
                } else {
                    System.out.println("El país ya existe en el conjunto.");
                }
            }
        }
    }

    public void MostrarPaises() {
        System.out.println("\nPaíses en el conjunto:");
        for (String p : paises) {
            System.out.println(p);
        }
    }

    public void MostrarPaisesOrdenados() {
        List<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);

        System.out.println("\nPaíses ordenados alfabéticamente:");
        for (String p : paisesOrdenados) {
            System.out.println(p);
        }
    }

    public void EliminarPais() {
        System.out.print("\nIngrese un país para eliminar del conjunto: ");
        String paisEliminar = sc.nextLine();

        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            String p = iterator.next();
            if (p.equalsIgnoreCase(paisEliminar)) {
                iterator.remove();
                System.out.println("País eliminado correctamente.");
                break;
            }
        }
    }
}
