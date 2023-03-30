/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class Ej6 {

    /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir 
    una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de 
    confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve 
    a mostrar el menú. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, num1, num2;
        char confirmacion;
        boolean salir = true;
        do {
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
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextInt();
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextInt();
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextInt();
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextInt();
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        System.out.println("El resultado de la división es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? ");
                    confirmacion = sc.next().charAt(0);
                    switch (confirmacion) {
                        case 'S':
                        case 's':
                            System.out.println("Saliendo del programa...");
                            return;
                        case 'N':
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
}
