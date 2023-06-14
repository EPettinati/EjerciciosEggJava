package Entidades;

public class Barco {

    protected String matricula;
    protected double eslora;
    protected short anioFab;

    public Barco() {
    }

    public Barco(String matricula, double eslora, short anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public short getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(short anioFab) {
        this.anioFab = anioFab;
    }

    public double calcularModulo() {
        return (eslora * 10);
    }
    
    @Override
    public String toString() {
        return "Barco: " +
                "matricula: '" + matricula + '\'' +
                ", eslora: " + eslora +
                ", año de Fabricacion: " + anioFab;
    }
}
