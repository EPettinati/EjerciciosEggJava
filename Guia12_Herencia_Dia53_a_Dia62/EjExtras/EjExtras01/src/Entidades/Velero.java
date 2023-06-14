package Entidades;

public final class Velero extends Barco {
    private byte numeroMastiles;

    public Velero(byte numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Velero(byte numeroMastiles, String matricula, double eslora, short anioFab) {
        super(matricula, eslora, anioFab);
        this.numeroMastiles = numeroMastiles;
    }    

    public byte getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(byte numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }
    
    @Override
    public String toString() {
        return "Velero: " +
                "numero de Mastiles: " + numeroMastiles +
                ", matricula: '" + matricula + '\'' +
                ", eslora: " + eslora +
                ", año de Fabricacion: " + anioFab;
    }
}
