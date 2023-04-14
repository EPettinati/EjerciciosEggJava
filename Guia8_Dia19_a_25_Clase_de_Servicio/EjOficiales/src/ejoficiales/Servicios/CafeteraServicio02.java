package ejoficiales.Servicios;

import ejoficiales.Entidades.Cafetera02;
import java.util.Scanner;

/*
Crear clase CafeteraServicio02 en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class CafeteraServicio02 {

    Cafetera02 c = new Cafetera02();
    Scanner sc = new Scanner(System.in);

    public void llenarCafetera() {
        c.setCapacidadMáxima(500);
        c.setCantidadActual(0);
        if (c.getCantidadActual() <= c.getCapacidadMáxima()) {
            System.out.println("A la cafetera le faltan: " + (c.getCapacidadMáxima() - c.getCantidadActual()) + " ml.");
            c.setCantidadActual(c.getCapacidadMáxima());
            System.out.println("Cafetera llena. Ahora tiene: " + c.getCantidadActual() + " ml.");
        } else {
            System.out.println("La cafetera está llena");
        }
    }

    public void servirTaza(int tam) {
        System.out.println("Ingrese el tamaño de la taza a servir");
        tam = sc.nextInt();
        if (c.getCantidadActual() >= tam) {
            c.setCantidadActual(c.getCantidadActual() - tam);
            System.out.println("La taza se lleno completa");
        } else {
            tam = c.getCantidadActual();
            c.setCantidadActual(0);
            System.out.println("Su taza se lleno hasta: " + tam + " ml.");
        }
    }

    public void vaciarCafetera() {
        c.setCantidadActual(0);
        System.out.println("Cafetera vaciada");
    }

    public void agregarCafe(int cafe) {
        System.out.println("Ingrese la cantidad de cafe a agregar");
            cafe = sc.nextInt();
        if ((cafe + c.getCantidadActual()) > c.getCapacidadMáxima()) {
            c.setCantidadActual(500);
            System.out.println("La cantidad de café que desea agregar supera la capacidad máxima de la cafetera, por lo tanto se llenó completamente.");
        } else {
            c.setCantidadActual(c.getCantidadActual() + cafe);
            System.out.println("Se agregaron " + cafe + " ml a la cafetera, la cantidad actual de café en la cafetera es de " + c.getCantidadActual() + " ml.");
        }
    }

    public void consultarDatos() {
        System.out.println(c.toString());
    }
}