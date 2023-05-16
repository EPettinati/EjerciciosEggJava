package ejoficiales;

import ejoficiales.Servicios.PaisesServicios05;

public class EjOficiales05 {

    public static void main(String[] args) {
        PaisesServicios05 p = new PaisesServicios05();
        
        p.GenerarPaises();
        p.MostrarPaises();
        p.MostrarPaisesOrdenados();
        p.EliminarPais();
        p.MostrarPaises();
    }
}