package Entidades;

public class BarcoMotor extends Barco {
    protected double potencia;

    public BarcoMotor(double potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(double potencia, String matricula, double eslora, short anioFab) {
        super(matricula, eslora, anioFab);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potencia;
    }
    
    @Override
    public String toString() {
        return "BarcoMotor: " +
                "potenciaCV: " + potencia +
                ", matricula: " + matricula + '\'' +
                ", eslora: " + eslora +
                ", año de Fabricacion: " + anioFab;
    }
}