package ejoficiales01;

import ejoficiales01.Entidades.Persona;
import ejoficiales01.Servicios.PersonaServicio;

public class EjOficiales01 {

    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona[] personas = new Persona[1];

        // Llenar el array con personas creadas con el método crearPersona()
        for (int i = 0; i < personas.length; i++) {
            personas[i] = personaServicio.crearPersona();
        }
        try {
            // Llamar a los métodos calcularIMC() y esMayorDeEdad() para cada persona
            for (Persona p : personas) {
                int resultadoIMC = personaServicio.calcularIMC(p);
                boolean esMayorDeEdad = personaServicio.esMayorDeEdad(p);

                // Imprimir resultados
                System.out.println(p.getNombre() + " - IMC: " + resultadoIMC + " - Mayor de edad: " + esMayorDeEdad);
            }

            // Calcular porcentaje de personas en su peso ideal, con sobrepeso o por debajo de su peso ideal
            int enPesoIdeal = 0;
            int conSobrepeso = 0;
            int porDebajoDePeso = 0;

            for (Persona p : personas) {
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

            for (Persona p : personas) {
                boolean esMayorDeEdad = personaServicio.esMayorDeEdad(p);

                if (esMayorDeEdad) {
                    mayoresDeEdad++;
                } else {
                    menoresDeEdad++;
                }
            }

            System.out.println("Personas mayores de edad: " + mayoresDeEdad + " (" + (mayoresDeEdad * 100 / personas.length) + "%)");
            System.out.println("Personas menores de edad: " + menoresDeEdad + " (" + (menoresDeEdad * 100 / personas.length) + "%)");

        } catch (NullPointerException e) {
            System.out.println("Error: no es posible inicializar con null. Excepción: " + e.getMessage());
        }
    }
}
