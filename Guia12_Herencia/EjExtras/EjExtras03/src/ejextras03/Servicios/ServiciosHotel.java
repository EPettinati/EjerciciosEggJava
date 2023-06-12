package ejextras03.Servicios;

import ejextras03.Entidades.Alojamientos;
import ejextras03.Entidades.Camping;
import ejextras03.Entidades.Hotel4;
import ejextras03.Entidades.Hotel5;
import ejextras03.Entidades.Residencia;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ServiciosHotel {

    Scanner sc = new Scanner(System.in);
    private List<Alojamientos> alojamientos;

    public ServiciosHotel() {
        alojamientos = new ArrayList<>();
    }

    public void agregarAlojamiento(Alojamientos alojamiento) {
        alojamientos.add(alojamiento);
    }

    public List<Alojamientos> obtenerTodosAlojamientos() {
        return alojamientos;
    }

    public void agregarAlojamientos() {
        // Agregar alojamientos
        Hotel4 hotel1 = new Hotel4('a', "Restaurante A", (short) 300, (short) 100, (short) 200, (short) 5, (short) 150, "Hotel A", "Dirección A", "Localidad A", "Gerente A");
        Hotel5 hotel2 = new Hotel5('b', "Restaurante B", (short) 130, (short) 50, (short) 100, (short) 10, (short) 100, (short) 170, (short) 5, (short) 200, "Hotel B", "Dirección B", "Localidad B", "Gerente B");
        Camping camping1 = new Camping((short) 50, (short) 20, false, true, 500.0, "Camping A", "Dirección A", "Localidad A", "Gerente A");
        Camping camping2 = new Camping((short) 100, (short) 40, true, false, 800.0, "Camping B", "Dirección B", "Localidad B", "Gerente B");
        Residencia residencia1 = new Residencia((short) 50, true, true, true, 1000.0, "Residencia A", "Dirección E", "Localidad E", "Gerente E");
        Residencia residencia2 = new Residencia((short) 80, false, false, false, 1200.0, "Residencia B", "Dirección F", "Localidad F", "Gerente F");

        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(camping1);
        alojamientos.add(camping2);
        alojamientos.add(residencia1);
        alojamientos.add(residencia2);
    }

    public List<Alojamientos> consultarTodosAlojamientos() {
        return alojamientos;
    }

    public List<Alojamientos> consultarHotelesOrdenados() {
        List<Alojamientos> hoteles = new ArrayList<>();
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4 || alojamiento instanceof Hotel5) {
                hoteles.add(alojamiento);
            }
        }
        hoteles.sort(this::compararHotelesPorPrecio);
        return hoteles;
    }

    private int compararHotelesPorPrecio(Alojamientos hotel1, Alojamientos hotel2) {
        double precio1 = precioHab((byte) 4);
        double precio2 = precioHab((byte) 5);

        if (precio1 > precio2) {
            return -1; // hotel1 es más caro
        } else if (precio1 < precio2) {
            return 1; // hotel1 es más barato
        } else {
            return 0; // tienen el mismo precio
        }
    }

    public List<Alojamientos> consultarCampingsConRestaurante() {
        List<Alojamientos> campingsConRestaurante = new ArrayList<>();
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.isRestaurante()) {
                    campingsConRestaurante.add(camping);
                }
            }
        }
        return campingsConRestaurante;
    }

    public List<Alojamientos> consultarResidenciasConDescuento() {
        List<Alojamientos> residenciasConDescuento = new ArrayList<>();
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.isDescuentosGremios()) {
                    residenciasConDescuento.add(residencia);
                }
            }
        }
        return residenciasConDescuento;
    }

    public double valorGym() {
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4) {
                Hotel4 hotel4 = (Hotel4) alojamiento;
                if (hotel4.getGym() == 'a') {
                    return 50;
                } else if (hotel4.getGym() == 'b') {
                    return 30;
                }
            } else if (alojamiento instanceof Hotel5) {
                Hotel5 hotel5 = (Hotel5) alojamiento;
                if (hotel5.getGym() == 'a') {
                    return 50;
                } else if (hotel5.getGym() == 'b') {
                    return 30;
                }
            }
        }
        return 0;
    }

    public double precioHab(byte num) {
        double vFinal = 0;
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4 && num == 4) {
                Hotel4 hotel4 = (Hotel4) alojamiento;
                vFinal = 50 + hotel4.getCantCamas() + hotel4.getCapRest() + valorGym();
                System.out.println("El hotel: " + hotel4.getNombre() + " sale por habitación: " + vFinal);
                break;
            } else if (alojamiento instanceof Hotel5 && num == 5) {
                Hotel5 hotel5 = (Hotel5) alojamiento;
                vFinal = 50 + hotel5.getCantCamas() + hotel5.getCapRest() + valorGym() + (15 * hotel5.getCantLimo());
                System.out.println("El hotel: " + hotel5.getNombre() + " sale por habitación: " + vFinal);
                break;
            }
        }

        return vFinal;
    }
}
