package ejextras.Entidades;

import java.util.Scanner;

public class Puntos {
    private double x1, y1, x2, y2;
    
    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca x1: ");
        x1 = sc.nextDouble();
        System.out.print("Introduzca y1: ");
        y1 = sc.nextDouble();
        System.out.print("Introduzca x2: ");
        x2 = sc.nextDouble();
        System.out.print("Introduzca y2: ");
        y2 = sc.nextDouble();
    }
    
    public double calcDistancia() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
        return distancia;
    }
}
