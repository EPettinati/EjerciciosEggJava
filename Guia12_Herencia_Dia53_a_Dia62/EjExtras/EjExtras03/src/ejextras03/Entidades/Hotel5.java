package ejextras03.Entidades;

import ejextras03.Servicios.ServiciosHotel;

public final class Hotel5 extends Hoteles {

    ServiciosHotel s = new ServiciosHotel();
    private char gym;
    private String nomRest;
    private short capRest;
    private short cantSalones;
    private short cantSuites;
    private short cantLimo;

    public Hotel5() {
    }

    public Hotel5(char gym, String nomRest, short capRest, short cantSalones, short cantSuites, short cantLimo, short cantHab, short cantCamas, short cantPisos, short precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, cantCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nomRest = nomRest;
        this.capRest = capRest;
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public char getGym() {
        return gym;
    }

    public void setGym(char gym) {
        this.gym = gym;
    }

    public String getNomRest() {
        return nomRest;
    }

    public void setNomRest(String nomRest) {
        this.nomRest = nomRest;
    }

    public short getCapRest() {
        return capRest;
    }

    public void setCapRest(short capRest) {
        this.capRest = capRest;
    }

    public short getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(short cantSalones) {
        this.cantSalones = cantSalones;
    }

    public short getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(short cantSuites) {
        this.cantSuites = cantSuites;
    }

    public short getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(short cantLimo) {
        this.cantLimo = cantLimo;
    }

    public double capHotel5() {
        return cantCamas;
    }

    public double capRest5() {
        if (capRest >= 0 && capRest < 30) {
            return 10;
        } else if (capRest >= 30 && capRest <= 50) {
            return 30;

        } else {
            return 50;
        }
    }

    @Override
    public String toString() {
        byte estrellas = 5;
        return "Hotel5: " + nombre;
    }

}
