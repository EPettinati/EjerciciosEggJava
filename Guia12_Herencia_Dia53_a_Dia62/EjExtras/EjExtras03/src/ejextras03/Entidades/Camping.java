package ejextras03.Entidades;

public final class Camping extends AlojamientoExtraHotelero {

    private short capacidadMaximaCarpas;
    private short cantidadBanos;
    private boolean restaurante;

    public Camping(short capacidadMaximaCarpas, short cantidadBanos, boolean restaurante, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.restaurante = restaurante;
    }

    public short getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(short capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public short getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(short cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping: " + nombre;
    }

}
