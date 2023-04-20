package ejoficiales; // Declaración del paquete

import ejoficiales.ClasesServicio.FechaService04; // Importación de la clase FechaService04 del paquete ejoficiales.ClasesServicio
import java.util.Scanner; // Importación de la clase Scanner del paquete java.util

public class EjOficiales04 { // Declaración de la clase EjOficiales04

    public static void main(String[] args) { // Método principal del programa
        Scanner sc = new Scanner(System.in); // Creación de un objeto de tipo Scanner para la entrada de datos por teclado
        
        System.out.print("Ingrese el Día: "); // Mensaje para solicitar el día de nacimiento
        int dia = sc.nextInt(); // Lectura del día ingresado por teclado
        System.out.print("Ingrese el Mes: "); // Mensaje para solicitar el mes de nacimiento
        int mes = sc.nextInt(); // Lectura del mes ingresado por teclado
        System.out.print("Ingrese el Año: "); // Mensaje para solicitar el año de nacimiento
        int anio = sc.nextInt(); // Lectura del año ingresado por teclado
        
        FechaService04 f = new FechaService04(); // Creación de un objeto de tipo FechaService04
        System.out.println(f.fechaNacimiento(dia, mes, anio)); // Imprime la fecha de nacimiento formateada
        System.out.println(f.fechaActual()); // Imprime la fecha actual formateada
        f.fechaNacimiento(dia, mes, anio); // Actualiza la fecha de nacimiento del objeto f
        f.fechaActual(); // Actualiza la fecha actual del objeto f
        System.out.println("Tu edad es: " + f.diferencia(f.fechaNacimiento(dia, mes, anio), f.fechaActual()) + " años."); // Imprime la edad calculada mediante el método diferencia del objeto f
    }
}
