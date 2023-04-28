package ejextras;

import ejextras.Entidades.Raices01;
import ejextras.Servicios.RaicesServicio01;

public class EjExtras01 {

    public static void main(String[] args) {
        RaicesServicio01 b = new RaicesServicio01();
        Raices01 r = null;
        
        b.crearObjeto();
        b.calcular(r);
    }

}
