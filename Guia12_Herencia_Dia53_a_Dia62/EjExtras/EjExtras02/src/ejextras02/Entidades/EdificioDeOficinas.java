package ejextras02.Entidades;

import java.util.Scanner;

public final class EdificioDeOficinas extends Edificio {
    private short numOficinas;
    private short cantPersonas;
    private short numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(String nombre, short numOficinas, short cantPersonasPorOficina, short numPisos) {
        super(10, 10, 10); // Valores de ejemplo para ancho, alto y largo
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public short getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(short numOficinas) {
        this.numOficinas = numOficinas;
    }

    public short getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(short cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public short getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(short numPisos) {
        this.numPisos = numPisos;
    }

    public void cantPersonas() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de Personas: ");
        cantPersonas = sc.nextByte();
        System.out.print("Ingrese las oficinas: ");
        numOficinas = sc.nextByte();
        
        int personasPorPiso = cantPersonas * numOficinas;
        int personasEnEdificio = personasPorPiso * numPisos;
        System.out.println("Personas en un piso: " + personasPorPiso);
        System.out.println("Personas en el edificio: " + personasEnEdificio);
        System.out.println();
    }
    
    @Override
    public double calcularSuperficie() {
        double superficie = 2 * (ancho * largo + ancho * alto + largo * alto);
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho * alto * largo;
        return volumen;
    }
}
