package ejoficial02.Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor(double resolucion, boolean tdt, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public void crearTelevisor() {
        crearElectrodomestico();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la resolución del televisor en pulgadas: ");
        resolucion = sc.nextInt();

        System.out.print("¿Tiene sintonizador TDT? (true/false): ");
        tdt = sc.nextBoolean();
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        
        if (resolucion > 40) {
            precioFinal *= 1.30 ;
        }
        
        if (tdt) {
            precioFinal += 500;
        }
        
        return precioFinal;
    }
}
