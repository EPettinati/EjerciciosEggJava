package ejoficiales.ClasesServicio;

import ejoficiales.Entidades.Persona05;
import java.text.SimpleDateFormat; // Importamos la clase SimpleDateFormat para dar formato a la fecha
import java.util.Date;
import java.util.Scanner;

public class PersonaService05 {

    public Persona05 crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine(); // Leemos el nombre de la persona ingresado por teclado
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Ingrese el Día: "); // Mensaje para solicitar el día de nacimiento
        int dia = sc.nextInt(); // Lectura del día ingresado por teclado
        System.out.print("Ingrese el Mes: "); // Mensaje para solicitar el mes de nacimiento
        int mes = sc.nextInt(); // Lectura del mes ingresado por teclado
        System.out.print("Ingrese el Año: "); // Mensaje para solicitar el año de nacimiento
        int anio = sc.nextInt(); // Lectura del año ingresado por teclado
        Date fecha = new Date(anio - 1900, mes - 1, dia); // Creamos un objeto Date con la fecha de nacimiento ingresada
        Persona05 persona = new Persona05(nombre, fecha); // Creamos un objeto Persona con los datos ingresados
        return persona; // Retornamos el objeto Persona creado
    }

    public int calcularEdad(Persona05 persona) {
        Date fA = new Date(); // Creamos un objeto Date con la fecha actual
        Date fN = persona.getFechaDeNacimiento(); // Obtenemos la fecha de nacimiento de la persona
        int edad = (fA.getYear() - fN.getYear()); // Calculamos la edad restando el año actual con el año de nacimiento
        if (fA.getMonth() < fN.getMonth()) { // Si el mes actual es menor que el mes de nacimiento, significa que no ha cumplido años aún
            edad--; // Por lo tanto, restamos 1 a la edad
        } else if (fA.getMonth() == fN.getMonth() && fN.getDate() > fA.getDate()) { // Si el mes actual es igual al mes de nacimiento y el día de nacimiento es mayor al día actual, significa que no ha cumplido años aún
            edad--; // Por lo tanto, restamos 1 a la edad
        }
        return edad; // Retornamos la edad calculada
    }

    public boolean menorQue(Persona05 persona, int edad) {
        return calcularEdad(persona) < edad; // Retornamos true si la edad calculada es menor que la edad ingresada por parámetro, o false en caso contrario
    }

    public void mostrarPersona(Persona05 persona, int edad) {
        SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy"); // Creamos un objeto SimpleDateFormat con el formato deseado para la fecha
        String fechaNacimiento = F.format(persona.getFechaDeNacimiento()); // Aplicamos el formato a la fecha de nacimiento de la persona
        System.out.println("Se llama: " + persona.getNombre() + " y tiene " + edad + " años. Y nació el: " + fechaNacimiento); // Mostramos los datos de la persona con la fecha de nacimiento formateada
    }
}
