package ejoficiales02.entidades;

import java.util.Random;

public class RevolverAgua {

    private int posActual;
    private int posTambor;
    Random r = new Random();

    public RevolverAgua() {
        this.posActual = 0;
        this.posTambor = 0;
    }

    public void llenarRevolver() {
        this.posActual = r.nextInt(7);
        this.posTambor = r.nextInt(7);
    }

    public boolean mojar() {
        return this.posActual == this.posTambor;
    }

    public void siguienteChorro() {
        this.posActual = (this.posActual + 1) % 6;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosTambor() {
        return posTambor;
    }

    public void setPosTambor(int posTambor) {
        this.posTambor = posTambor;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }
    
    @Override
    public String toString() {
        return "La posición actual es: " + posActual + ", y la posición del tambor es: " + posTambor;
    }
    
    
}
