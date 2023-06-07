package ejoficial01;

import ejoficial01.Entidades.Animal;
import ejoficial01.Entidades.Caballo;
import ejoficial01.Entidades.Gato;
import ejoficial01.Entidades.Perro;

public class EjOficial01 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro", (byte) 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", (byte) 10, "Chihuahua");
        Animal gato1 = new Gato("Pelusa", "Galletas", (byte) 15, "Siames");
        Animal caballo1 = new Caballo("Spark", "Pasto", (byte) 25, "Fino");

        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
    }

}
