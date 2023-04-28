package ejextras.Entidades;

public class NIF02 {
    private long dni;
    private char letra;

    public NIF02() {
    }

    public NIF02(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}
