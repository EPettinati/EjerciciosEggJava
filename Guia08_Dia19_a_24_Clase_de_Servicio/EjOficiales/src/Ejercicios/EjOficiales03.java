package Ejercicios;

import ejoficiales.Entidades.Persona03;
import ejoficiales.Servicios.PersonaServicio03;
import java.util.Scanner;

public class EjOficiales03 {

    public static void main(String[] args) {
        PersonaServicio03 personaServicio = new PersonaServicio03();
        Persona03[] personas = new Persona03[4];

        // Llenar el array con personas creadas con el método crearPersona()
        for (int i = 0; i < personas.length; i++) {
            personas[i] = personaServicio.crearPersona();
        }

        // Llamar a los métodos calcularIMC() y esMayorDeEdad() para cada persona
        for (Persona03 p : personas) {
            int resultadoIMC = personaServicio.calcularIMC(p);
            boolean esMayorDeEdad = personaServicio.esMayorDeEdad(p);

            // Imprimir resultados
            System.out.println(p.getNombre() + " - IMC: " + resultadoIMC + " - Mayor de edad: " + esMayorDeEdad);
        }

        // Calcular porcentaje de personas en su peso ideal, con sobrepeso o por debajo de su peso ideal
        int enPesoIdeal = 0;
        int conSobrepeso = 0;
        int porDebajoDePeso = 0;

        for (Persona03 p : personas) {
            int resultadoIMC = personaServicio.calcularIMC(p);
            if (resultadoIMC == -1) {
                porDebajoDePeso++;
            } else if (resultadoIMC == 0) {
                enPesoIdeal++;
            } else if (resultadoIMC == 1) {
                conSobrepeso++;
            }
        }

        System.out.println("Personas en su peso ideal: " + enPesoIdeal + " (" + (enPesoIdeal * 100 / personas.length) + "%)");
        System.out.println("Personas con sobrepeso: " + conSobrepeso + " (" + (conSobrepeso * 100 / personas.length) + "%)");
        System.out.println("Personas por debajo de su peso ideal: " + porDebajoDePeso + " (" + (porDebajoDePeso * 100 / personas.length) + "%)");

        // Calcular porcentaje de personas mayores y menores de edad
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        for (Persona03 p : personas) {
            boolean esMayorDeEdad = personaServicio.esMayorDeEdad(p);

            if (esMayorDeEdad) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        System.out.println("Personas mayores de edad: " + mayoresDeEdad + " (" + (mayoresDeEdad * 100 / personas.length) + "%)");
        System.out.println("Personas menores de edad: " + menoresDeEdad + " (" + (menoresDeEdad * 100 / personas.length) + "%)");
    }
}
