package ejextra03;

import entidades.Cliente;
import entidades.Cuota;
import entidades.Poliza;
import entidades.Vehiculos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EjExtra03 {

    public static void main(String[] args) {
        // Crear lista de clientes
        List<Cliente> clientes = new ArrayList<>();

        // Crear clientes
        for (int i = 0; i < 2; i++) {
            Cliente cliente = new Cliente();
            cliente.setNombreApellido("Cliente " + (i + 1));
            cliente.setDocumento("Documento " + (i + 1));
            cliente.setMail("cliente" + (i + 1) + "@example.com");
            cliente.setDomicilio("Domicilio " + (i + 1));
            cliente.setTelefono("Teléfono " + (i + 1));

            // Agregar cliente a la lista
            clientes.add(cliente);
        }

        // Crear lista de vehículos
        List<Vehiculos> vehiculos = new ArrayList<>();
        Vehiculos vehiculo = new Vehiculos();
        
        // Crear vehículos
        for (int i = 0; i < 2; i++) {
            vehiculo.setMarca("Marca " + (i + 1));
            vehiculo.setModelo("Modelo " + (i + 1));
            vehiculo.setAnio(2021 + i);
            vehiculo.setNumeroMotor("Número de motor " + (i + 1));
            vehiculo.setChasis("Chasis " + (i + 1));
            vehiculo.setColor("Color " + (i + 1));
            vehiculo.setTipo("Tipo " + (i + 1));

            // Agregar vehículo a la lista
            vehiculos.add(vehiculo);
        }

        // Crear lista de pólizas
        List<Poliza> polizas = new ArrayList<>();

        // Crear pólizas
        for (int i = 0; i < 2; i++) {
            Poliza poliza = new Poliza();
            poliza.setNumeroPoliza("Póliza " + (i + 1));
            poliza.setFechaInicio(new Date());
            poliza.setFechaFin(new Date());
            poliza.setCantidadCuotas(12);
            poliza.setFormaPago("Efectivo");
            poliza.setMontoTotalAsegurado(100000.0);
            poliza.setIncluyeGranizo(true);
            poliza.setMontoMaximoGranizo(5000.0);
            poliza.setTipoCobertura("Total");
            poliza.setCliente(clientes.get(i));
            poliza.setVehiculo(vehiculos.get(i));

            // Agregar póliza a la lista
            polizas.add(poliza);
        }

        // Crear lista de cuotas
        List<Cuota> cuotas = new ArrayList<>();

        // Crear cuotas
        for (int i = 0; i < 2; i++) {
            Cuota cuota = new Cuota();
            cuota.setNumeroCuota(i + 1);
            cuota.setMontoTotal(2000.0);
            cuota.setPagada(true);
            cuota.setFechaVencimiento(new Date());
            cuota.setFormaPago("Transferencia");
            cuota.setPoliza(polizas.get(i));

            // Agregar cuota a la lista
            cuotas.add(cuota);
        }

        // Mostrar información de los objetos creados
        for (Poliza poliza : polizas) {
            System.out.println("Número de póliza: " + poliza.getNumeroPoliza());
            System.out.println("Fecha de inicio: " + poliza.getFechaInicio());
            System.out.println("Fecha de fin: " + poliza.getFechaFin());
            System.out.println("Cantidad de cuotas: " + poliza.getCantidadCuotas());
            System.out.println("Forma de pago: " + poliza.getFormaPago());
            System.out.println("Monto total asegurado: " + poliza.getMontoTotalAsegurado());
            System.out.println("Incluye granizo: " + poliza.isIncluyeGranizo());
            System.out.println("Monto máximo granizo: " + poliza.getMontoMaximoGranizo());
            System.out.println("Tipo de cobertura: " + poliza.getTipoCobertura());
            System.out.println("Cliente: " + poliza.getCliente().getNombreApellido());
            System.out.println("Vehículo: " + poliza.getVehiculo().getMarca() + " " + poliza.getVehiculo().getModelo());
            System.out.println("--------------------------------------");
        }

        for (Cuota cuota : cuotas) {
            System.out.println("Número de cuota: " + cuota.getNumeroCuota());
            System.out.println("Monto total de la cuota: " + cuota.getMontoTotal());
            System.out.println("Pagada: " + cuota.isPagada());
            System.out.println("Fecha de vencimiento: " + cuota.getFechaVencimiento());
            System.out.println("Forma de pago: " + cuota.getFormaPago());
            System.out.println("--------------------------------------");
        }
    }
}