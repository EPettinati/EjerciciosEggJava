package ejoficial03.Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumo = 'F';
        this.peso = 1;
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        char letraValida = Character.toUpperCase(letra);
        if (letraValida >= 'A' && letraValida <= 'F') {
            return letraValida;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color) {
        String colorValido = color.toLowerCase();
        switch (colorValido) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return colorValido;
            default:
                return "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del electrodoméstico: ");
        precio = sc.nextDouble();

        sc.nextLine();

        System.out.print("Ingrese el color del electrodoméstico: ");
        color = sc.nextLine();

        System.out.print("Ingrese el consumo energético del electrodoméstico (letra entre A y F): ");
        consumo = sc.next().charAt(0);

        System.out.print("Ingrese el peso del electrodoméstico: ");
        peso = sc.nextDouble();

        // Comprobar el consumo energético y el color
        consumo = comprobarConsumoEnergetico(consumo);
        color = comprobarColor(color);
    }

    public double precioFinal() {
        double precioFinal = precio;

        switch (consumo) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}
