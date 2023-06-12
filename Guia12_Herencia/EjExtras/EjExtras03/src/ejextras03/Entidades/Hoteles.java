package ejextras03.Entidades;

public class Hoteles extends Alojamientos{
    protected short cantHab;
    protected short cantCamas;
    protected short cantPisos;
    protected short precioHab;

    public Hoteles() {
    }

    public Hoteles(short cantHab, short cantCamas, short cantPisos, short precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public short getCantHab() {
        return cantHab;
    }

    public void setCantHab(short cantHab) {
        this.cantHab = cantHab;
    }

    public short getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(short cantCamas) {
        this.cantCamas = cantCamas;
    }

    public short getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(short cantPisos) {
        this.cantPisos = cantPisos;
    }

    public short getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(short precioHab) {
        this.precioHab = precioHab;
    }
}
