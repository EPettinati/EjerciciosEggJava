/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author Epett
 */
public class EjExtras12 {
/* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // recorre todos los números del 0-0-0 al 9-9-9
        for (int i = 0; i <= 999; i++) {
            String numero = String.format("%03d", i); // convierte el número a un String con 3 dígitos

            // reemplaza el número 3 por una E
            if (numero.substring(0, 1).equals("3")) {
                numero = "E" + numero.substring(1);
            }
            if (numero.substring(1, 2).equals("3")) {
                numero = numero.substring(0, 1) + "E" + numero.substring(2);
            }
            if (numero.substring(2, 3).equals("3")) {
                numero = numero.substring(0, 2) + "E";
            }

            System.out.println(numero.substring(0, 1) + "-" + numero.substring(1, 2) + "-" + numero.substring(2, 3)); // muestra el número con la E si corresponde
        }
    }
}