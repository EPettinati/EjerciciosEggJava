package ejoficiales;

import ejoficiales.ClasesServicio.PersonaService05;
import ejoficiales.Entidades.Persona05;
import java.util.Scanner;

public class EjOficiales05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaService05 p = new PersonaService05();
        
        Persona05 persona = p.crearPersona();
        
        System.out.print("Ingrese una edad: ");
        int edad = sc.nextInt();
        System.out.println("¿Es menor que?: "+ edad + " " + p.menorQue(persona, edad));
        
                
        p.mostrarPersona(persona, p.calcularEdad(persona));
        
        
    }

}
