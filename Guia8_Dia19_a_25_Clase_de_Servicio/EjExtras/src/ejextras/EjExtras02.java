package ejextras;

import ejextras.Entidades.NIF02;
import ejextras.Servicios.NIFServicio02;

public class EjExtras02 {

    public static void main(String[] args) {
        NIFServicio02 n = new NIFServicio02();
        NIF02 m = n.crearNif();
        n.mostrar(m);
    }

}
