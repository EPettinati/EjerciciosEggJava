package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practica practica = new Practica();

        System.out.println((int) Math.log10(1000) + 1);

        //Generar las variables necesarias para probar
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D", "A", "C", "D", "A"}));
        System.out.println(practica.mediasAmigas(medias));
        System.out.println(practica.numeroCapicua(null));
        System.out.println(practica.prisioneroDulce(5, 10, 5));

    }
}
