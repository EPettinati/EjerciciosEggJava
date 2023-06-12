package ejextras03;

import ejextras03.Entidades.Alojamientos;
import ejextras03.Servicios.ServiciosHotel;
import java.util.List;

public class EjExtra03 {

    public static void main(String[] args) {
        ServiciosHotel serviciosHotel = new ServiciosHotel();
        serviciosHotel.agregarAlojamientos();

        System.out.println("Todos los alojamientos:");
        List<Alojamientos> todosAlojamientos = serviciosHotel.consultarTodosAlojamientos();
        for (Alojamientos alojamiento : todosAlojamientos) {
            System.out.println(alojamiento);
        }

        System.out.println("\nHoteles de más barato a más caro:");
        List<Alojamientos> hotelesOrdenados = serviciosHotel.consultarHotelesOrdenados();
        for (Alojamientos hotel : hotelesOrdenados) {
            System.out.println(hotel);
        }

        System.out.println("\nCampings con restaurante:");
        List<Alojamientos> campingsConRestaurante = serviciosHotel.consultarCampingsConRestaurante();
        for (Alojamientos camping : campingsConRestaurante) {
            System.out.println(camping);
        }

        System.out.println("\nResidencias con descuento:");
        List<Alojamientos> residenciasConDescuento = serviciosHotel.consultarResidenciasConDescuento();
        for (Alojamientos residencia : residenciasConDescuento) {
            System.out.println(residencia);
        }
    }
}