package Servicios;

import Entidades.EntidadesIntegrador;
import java.util.Scanner;
        
public class ServiciosIntegrador {
    EntidadesIntegrador n = new EntidadesIntegrador();
    
    public EntidadesIntegrador Integrador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar el nombre: ");
        n.setNombre(sc.nextLine());
        do {
        System.out.print("Ingresar la nota: ");
        n.setNota(sc.nextByte());
        } while (n.getNota() > 11 || n.getNota() < 0);
        EntidadesIntegrador est = new EntidadesIntegrador(n.getNombre(),n.getNota());
        return est;
    }
    
    public byte calcularPromedio() {
        return n.getNota();
    }
    
    public String pasarNombres() {
        return n.getNombre();
    }
    
}
