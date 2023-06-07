package ejlectura01;

import ejlectura01.Animal.Animal;
import ejlectura01.Animal.Gato;
import ejlectura01.Animal.Perro;
import java.util.ArrayList;
import java.util.List;

public class EjLectura01 {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        animales.add(a);
        animales.add(b);
        animales.add(c);

        for (Animal animal : animales) {
            System.out.println(animal.hacerRuido());
        }
    }

}
