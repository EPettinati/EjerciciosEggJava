package ejoficiales.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicios06 {
    Scanner sc = new Scanner(System.in);
    private static Map<String, Double> inventario = new HashMap<>();

    public void mostrarMenu() {
        System.out.println("=== MENÚ ===");
        System.out.println("1. Agregar un producto");
        System.out.println("2. Modificar el precio de un producto");
        System.out.println("3. Eliminar un producto");
        System.out.println("4. Mostrar inventario");
        System.out.println("5. Salir");
    }

    public void agregarProducto() {
        System.out.print("Ingrese un nuevo producto: ");
        String nombre = sc.next();
        System.out.print("Ingrese el valor: ");
        double precio = sc.nextDouble();

        inventario.put(nombre, precio);
        System.out.println("Agregado.");
    }

    public void modificarPrecio() {
        System.out.print("Ingrese el producto a cambiar: ");
        String nombre = sc.next();

        if (inventario.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = sc.nextDouble();

            inventario.put(nombre, nuevoPrecio);
            System.out.println("Precio del producto modificado correctamente.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar");
        String nombre = sc.next();

        if (inventario.containsKey(nombre)) {
            inventario.remove(nombre);
            System.out.println("Eliminado correctamente");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    public void mostrarInventario() {
        System.out.println("=== INVENTARIO ===");
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Map.Entry<String, Double> entry : inventario.entrySet()) {
                String nombre = entry.getKey();
                double precio = entry.getValue();
                System.out.println("Producto: " + nombre + " - Precio: " + precio);
            }
        }
    }
}
