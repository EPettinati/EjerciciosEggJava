package ejoficial03.Entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void creaLavadora() {
        crearElectrodomestico();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la carga de la lavadora: ");
        carga = sc.nextDouble();
    }
    
    @Override
    public double precioFinal() {
        // Llama al método precioFinal() de la clase padre (Electrodomestico)
        double precioFinal = super.precioFinal();

        // Aumentar precio si la carga es mayor a 30 kg
        if (carga > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}
