/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7y8;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class EjOficiales02 {

    /* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e 
    indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y
    frenar cuando el usuario ingrese la palabra “No”.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            String nombreM = nombreV(); // Se realiza un String para guardar el nombre de la Varible adentro de Main
            int edadM = edadV(); // Se realiza un Int para guardar la edad de la Varible adentro de Main
            if (edadM < 18) {
                System.out.println(nombreM + " es menor de edad.");
            } else {
                System.out.println(nombreM + " es mayor de edad.");
            }

            System.out.print("¿Desea seguir mostrando personas? (Si/No): ");
            String respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }

            n++; // Intera la cantidad de personas que se registraron
        }

        System.out.println("Se mostraron los datos de " + (n + 1) + " personas.");
    }

    public static String nombreV() { // Se declara la variable para los nombres
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nick = sc.next();
        return nick;
    }

    public static int edadV() { // Se declara la variable para las edades
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();
        return edad;
    }

}
