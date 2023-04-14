package Ejercicios;

import ejoficiales.Servicios.CafeteraServicio02;
import java.util.Scanner;

public class EjOficiales02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CafeteraServicio02 c = new CafeteraServicio02();
        int op;

        do {
            System.out.println("Ingrese la opción deseada");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Consultar datos de la cafetera");
            System.out.println("6. Salir");
            
            System.out.println("");
            op = sc.nextInt();
            System.out.println("");

            switch (op) {
                case 1:
                    c.llenarCafetera();
                    break;
                case 2:
                    c.servirTaza(op);
                    break;
                case 3:
                    c.vaciarCafetera();
                    break;
                case 4:
                    c.agregarCafe(op);
                    break;
                case 5:
                    c.consultarDatos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta");
            }

        } while (op != 6);
    }
}
