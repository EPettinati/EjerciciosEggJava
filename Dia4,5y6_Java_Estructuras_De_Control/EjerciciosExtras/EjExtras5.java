/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class EjExtras5 {

    /*  */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tipoSocio;
        double costoTratamiento;
        double importeAPagar;

        System.out.print("Ingrese el tipo de socio (A, B o C): ");
        tipoSocio = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el costo del tratamiento: ");
        costoTratamiento = sc.nextDouble();

        switch (tipoSocio) {
            case 'A':
                importeAPagar = costoTratamiento / 2;
                break;
            case 'B':
                importeAPagar = costoTratamiento * 0.65;
                break;
            case 'C':
                importeAPagar = costoTratamiento;
                break;
            default:
                System.out.println("Tipo de socio inválido");
                return;
        }
        System.out.println("El importe a pagar es de $" + importeAPagar);
    }
}