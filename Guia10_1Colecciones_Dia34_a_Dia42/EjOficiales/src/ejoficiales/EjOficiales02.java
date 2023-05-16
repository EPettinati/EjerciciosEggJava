package ejoficiales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjOficiales02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.print("Ingrese una raza de perro (o 'salir' para terminar): ");
            String raza = scanner.nextLine();

            if (raza.equalsIgnoreCase("salir")) {
                salir = true;
            } else {
                razasPerros.add(raza);
            }
        }

        System.out.println("Razas de perros guardadas:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }

        System.out.println("Ingrese el nombre de la Raza a remover.");
        String rem = sc.nextLine();

        Collections.sort(razasPerros);

        if (razasPerros.contains(rem)) {
            razasPerros.remove(rem);
            System.out.println("Perro eliminado. Lista de razas de perros actualizada:");
            for (String raza : razasPerros) {
                System.out.println(raza);
            }
        } else {
            System.out.println("El perro no se encontraba en la lista. Lista de razas de perros actualizada:");
            for (String raza : razasPerros) {
                System.out.println(raza);
            }
        }
    }
}