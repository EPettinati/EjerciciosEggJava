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
public class EjOficiales01 {

    /* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
    La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, num1, num2, resultado;
        char confirmacion;
        boolean salir = true;
        do {
            System.out.println("Ingrese dos numeros");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("ELIJA UNA OPCIÓN");
            opcion = sc.nextInt();
            OUTER:
            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = resta(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = multi(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    resultado = div(num1, num2);
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        System.out.println("El resultado de la división es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? ");
                    confirmacion = sc.next().toLowerCase().charAt(0);
                    switch (confirmacion) {
                        case 's':
                            System.out.println("Saliendo del programa...");
                            return;
                        case 'n':
                            break OUTER;
                        default:
                            System.out.println("Opción inválida. Volviendo al menú principal.");
                            break OUTER;
                    }
                default:
                    System.out.println("Opción invalida");
            }
        } while (salir);
    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int resta(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    public static int multi(int num1, int num2) {
        int multi;
        multi = num1 * num2;
        return multi;
    }

    public static int div(int num1, int num2) {
        int div;
        div = num1 / num2;
        return div;
    }

}
