package ejoficiales;

import java.util.ArrayList;
import java.util.Scanner;

public class EjOficiales01 {

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
    }
}