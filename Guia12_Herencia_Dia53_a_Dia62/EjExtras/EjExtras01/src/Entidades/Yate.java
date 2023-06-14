package Entidades;

public final class Yate extends Barco{
    private byte camarote;
    private double potencia;

    public Yate(byte camarote, double potencia) {
        this.camarote = camarote;
        this.potencia = potencia;
    }

    public Yate(byte camarote, double potencia, String matricula, double eslora, short anioFab) {
        super(matricula, eslora, anioFab);
        this.camarote = camarote;
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }    

    public byte getCamarote() {
        return camarote;
    }

    public void setCamarote(byte camarote) {
        this.camarote = camarote;
    }
    
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potencia + camarote;
    }
    
    @Override
    public String toString() {
        return "Yate: " +
                "camarotes: " + camarote +
                ", potenciaCV: " + potencia +
                ", matricula: '" + matricula + '\'' +
                ", eslora: " + eslora +
                ", año de Fabricacion: " + anioFab;
    }
}
