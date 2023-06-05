package ejoficial03;

import Servicio.ServiciosBaraja;
import java.util.Scanner;

public class EjOficial03 {

    public static void main(String[] args) {
        ServiciosBaraja b = new ServiciosBaraja();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("--------Seleccione-------- \n1)Barajar. \n2)Tomar carta. \n3)Mostrar cantidad de cartas en el mazo. \n4)Dar cartas al jugador. \n5)Mostrar cartas en juego. \n6)Mostrar todas las cartas. \n7)Salir. \n--------------------------" );
            byte op = sc.nextByte();
            switch (op) {
                case 1:
                    b.barajar();
                    break;
                case 2:
                    b.siguienteCarta();
                    break;
                case 3:
                    b.cartasDisponibles();
                    break;
                case 4:
                    b.darCartas();
                    break;
                case 5:
                    b.cartasMonton();
                    break;
                case 6:
                    b.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Saliendo....");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}
