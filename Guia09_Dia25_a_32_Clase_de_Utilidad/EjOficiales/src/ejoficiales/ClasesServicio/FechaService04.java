package ejoficiales.ClasesServicio; // Declaración del paquete

import java.util.Date; // Importación de la clase Date de la librería Java

public class FechaService04 { // Declaración de la clase FechaService04

    public Date fechaNacimiento(int dia, int mes, int anio) { // Declaración del método fechaNacimiento que recibe tres parámetros enteros y devuelve un objeto Date
        Date fecha = new Date(anio - 1900, mes - 1, dia); // Creación de un objeto Date a partir de los parámetros de entrada
        return fecha; // Devolución del objeto Date
    }

    public Date fechaActual() { // Declaración del método fechaActual que no recibe parámetros y devuelve un objeto Date
        return new Date(); // Creación de un objeto Date con la fecha y hora actuales y devolución del mismo
    }

    public int diferencia(Date fN, Date fA) { // Declaración del método diferencia que recibe dos objetos Date como parámetros y devuelve un entero
        int edad = (fA.getYear() - fN.getYear()); // Cálculo de la diferencia en años entre las dos fechas y asignación a la variable edad
        if (fA.getMonth() < fN.getMonth()) { // Si el mes de la fecha actual es menor al mes de la fecha de nacimiento
            edad--; // se resta un año a la edad
        } else if (fA.getMonth() == fN.getMonth() && fN.getDate() > fA.getDate()) { // Si los meses son iguales y el día de nacimiento es mayor al día actual
            edad--; // se resta un año a la edad
        }
        return edad; // Devolución de la edad
    }
}
