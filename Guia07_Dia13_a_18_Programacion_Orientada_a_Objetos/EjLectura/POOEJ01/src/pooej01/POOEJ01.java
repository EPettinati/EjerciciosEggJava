package pooej01;

import pooej01.Entidades.Persona;

public class POOEJ01 {

public static void main(String[] args) {
        // Crear objeto Persona utilizando constructor sin argumentos
        Persona persona1 = new Persona();

        // Crear objeto Persona utilizando constructor con argumentos
        Persona persona2 = new Persona("Juan", 25);

        // Modificar atributos utilizando métodos setter
        persona1.setNombre("María");
        persona1.setEdad(30);

        // Imprimir atributos utilizando métodos getter
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        System.out.println(persona2.getNombre() + " tiene " + persona2.getEdad() + " años.");
    }
}