package ejextras02;

import ejextras02.Entidades.Edificio;
import ejextras02.Entidades.EdificioDeOficinas;
import ejextras02.Entidades.Polideportivo;
import java.util.ArrayList;

public class EjExtras02 {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Agregar dos polideportivos
        Polideportivo poli1 = new Polideportivo("Polideportivo 1", "Techado", 30, 40, 50);
        Polideportivo poli2 = new Polideportivo("Polideportivo 2", "Abierto", 20, 35, 45);
        edificios.add(poli1);
        edificios.add(poli2);

        // Agregar dos edificios de oficinas
        EdificioDeOficinas edificio1 = new EdificioDeOficinas("Edificio 1", (short) 5, (short) 10,(short) 3);
        EdificioDeOficinas edificio2 = new EdificioDeOficinas("Edificio 2", (short) 7, (short) 8, (short) 5);
        edificios.add(edificio1);
        edificios.add(edificio2);

        // Calcular superficie y volumen de cada edificio
        for (Edificio edificio : edificios) {
            System.out.println("Superficie del edificio: " + edificio.calcularSuperficie());
            System.out.println("Volumen del edificio: " + edificio.calcularVolumen());
            System.out.println();
        }

        // Contar polideportivos techados y abiertos
        int techados = 0;
        int abiertos = 0;
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoInstalacion().equals("Techado")) {
                    techados++;
                } else {
                    abiertos++;
                }
            }
        }
        System.out.println("Cantidad de polideportivos techados: " + techados);
        System.out.println("Cantidad de polideportivos abiertos: " + abiertos);

        // Calcular cantidad de personas en cada edificio de oficinas
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edifOficinas = (EdificioDeOficinas) edificio;
                edifOficinas.cantPersonas();
            }
        }
    }

}
