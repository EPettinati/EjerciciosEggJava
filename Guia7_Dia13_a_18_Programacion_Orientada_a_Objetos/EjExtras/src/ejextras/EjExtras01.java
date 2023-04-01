package ejextras;

import ejextras.Entidades.Cancion;

public class EjExtras01 {

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Queen","Bohemian Rhapsody");
        
        c1.setAutro("Paulo");
        c1.setTitulo("La cucaracha");
        
        System.out.println("El autor es: " + c1.getAutro() + " y el titulo es: " + c1.getTitulo());
        System.out.println("El autor es: " + c2.getAutro() + " y el titulo es: " + c2.getTitulo());
    }

}
