package ejextras.Entidades;

public class Ahorcado02 {
    private char[] palabra;
    private int cantLetras;
    private int jugaMax;

    public Ahorcado02(char[] palabra) {
        this.palabra = palabra;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }
    
    public Ahorcado02() {
    }

    public Ahorcado02(int cantLetras, int jugaMax) {
        this.cantLetras = cantLetras;
        this.jugaMax = jugaMax;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugaMax() {
        return jugaMax;
    }

    public void setJugaMax(int jugaMax) {
        this.jugaMax = jugaMax;
    }
    
}
