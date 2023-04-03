package ejextras;

import ejextras.Entidades.Cuenta;

public class EjExtras04 {

    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        c.setTitular("Ezequiel");
        c.setSaldo(5000);
        c.retirarDinero(0);
    }

}
