package ejextras03.Entidades;

import ejextras03.Servicios.ServiciosHotel;

public final class Hotel4 extends Hoteles {

    ServiciosHotel s = new ServiciosHotel();

    private char gym;
    private String nomRest;
    private short capRest;

    public Hotel4() {
    }

    public Hotel4(char gym, String nomRest, short capRest, short cantHab, short cantCamas, short cantPisos, short precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, cantCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nomRest = nomRest;
        this.capRest = capRest;
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

    public double capHotel4() {
        return cantCamas;
    }

    public double capRest4() {
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
        byte estrellas = 4;
        return "Hotel4: " + nombre;
    }

}
