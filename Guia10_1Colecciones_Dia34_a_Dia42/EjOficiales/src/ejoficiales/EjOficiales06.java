package ejoficiales;

import ejoficiales.Servicios.TiendaServicios06;
import java.util.Scanner;

public class EjOficiales06 {

    public static void main(String[] args) {
        boolean ejecutar = true;
        Scanner sc = new Scanner(System.in);
        TiendaServicios06 p = new TiendaServicios06();

        while (ejecutar) {
            p.mostrarMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    p.agregarProducto();
                    break;
                case 2:
                    p.modificarPrecio();
                    break;
                case 3:
                    p.eliminarProducto();
                    break;
                case 4:
                    p.mostrarInventario();
                    break;
                case 5:
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        System.out.println("¡Gracias por utilizar la aplicación de la tienda!");
    }
}