package ejoficiales.Servicios;

import ejoficiales.Entidades.Persona03;
import java.util.Scanner;

public class PersonaServicio03 {
    // se crea una instancia de Scanner para leer la entrada del usuario
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    // método para crear una nueva instancia de Persona03 con los datos ingresados por el usuario
    public Persona03 crearPersona() {
        System.out.println("Introducir el nombre");
        String nombre = sc.next(); // se lee el nombre de la persona
        System.out.println("Introducir edad");
        byte edad = sc.nextByte(); // se lee la edad de la persona

        String sexo;
        do {
            // se le pide al usuario que ingrese el sexo de la persona (solo una letra)
            System.out.println("Introducir sexo // solo la letra");
            sexo = sc.next().toLowerCase(); // se lee el sexo de la persona (en minúsculas)
            if (!"h".equals(sexo) && !"m".equals(sexo) && !"o".equals(sexo)) {
                // si el sexo ingresado es inválido, se muestra un mensaje de error
                System.out.println("Sexo invalido");
            }
        } while (!"h".equals(sexo) && !"m".equals(sexo) && !"o".equals(sexo)); // se repite mientras el sexo es inválido

        System.out.println("Ingrese el peso");
        double peso = sc.nextDouble(); // se lee el peso de la persona
        System.out.println("Ingrese la altura");
        double altura = sc.nextDouble(); // se lee la altura de la persona

        // se crea una nueva instancia de Persona03 con los datos ingresados por el usuario
        Persona03 p = new Persona03(nombre, edad, sexo, peso, altura);
        return p; // se devuelve la nueva instancia de Persona03
    }

    // método para determinar si una persona es mayor de edad (18 años o más)
    public boolean esMayorDeEdad(Persona03 p) {
        return p.getEdad() >= 18; // se devuelve true si la persona es mayor de edad, false en caso contrario
    }

    // método para calcular el índice de masa corporal (IMC) de una persona
    public int calcularIMC(Persona03 p) {
        double imc = p.getPeso() / Math.pow(p.getAltura(), 2); // se calcula el IMC
        if (imc < 20) {
            return -1; // la persona tiene un peso por debajo del normal
        } else if (imc > 20 && imc < 25) {
            return 0; // la persona tiene un peso normal
        } else {
            return 1; // la persona tiene sobrepeso
        }
    }
}
