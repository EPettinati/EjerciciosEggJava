package ejoficiales.Entidades;
/*
Programa Nespresso. Desarrolle una clase Cafetera02 en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y 
cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. 
*/
public class Cafetera02 {
    private int capacidadMáxima;
    private int cantidadActual;

    public Cafetera02() {
    }

    public Cafetera02(int capacidadMáxima, int cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "La capacidad maxima de la cafetera es: " + capacidadMáxima + ", y la cantidad actual es: " + cantidadActual + '}';
    }
}