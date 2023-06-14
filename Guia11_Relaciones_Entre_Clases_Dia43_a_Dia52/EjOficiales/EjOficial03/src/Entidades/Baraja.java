package Entidades;

import Enum.Palo;
import java.util.ArrayList;
import java.util.List;

public class Baraja {

    List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList();
        Palo[] palos = Palo.values();

        for (Palo palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    cartas.add(new Carta(i, palo));
                }
            }
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
}
