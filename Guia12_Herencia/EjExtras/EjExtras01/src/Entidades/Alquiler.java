package Entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Alquiler {
    Calendar calendar = Calendar.getInstance();
    Scanner sc = new Scanner(System.in);
    
    private String nombre;
    private int dni;
    private Date fechAlquiler;
    private Date fechaDevolucion;
    private byte posAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dni, Date fechAlquiler, Date fechaDevolucion, byte posAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechAlquiler = fechAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechAlquiler() {
        return fechAlquiler;
    }

    public void setFechAlquiler(Date fechAlquiler) {
        this.fechAlquiler = fechAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public byte getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(byte posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calcularPrecioAlquiler() {
        calendar.setTime(fechAlquiler);
        System.out.print("Ingrese la cantidad de dias de alquiler: ");
        byte cant = sc.nextByte();
        calendar.add(Calendar.DAY_OF_YEAR, cant); // Suma cant días a la fecha actual
        fechaDevolucion = calendar.getTime();
        
        long diferencia = fechaDevolucion.getTime() - fechAlquiler.getTime();
        int diasOcupacion = (int) (diferencia / (24 * 60 * 60 * 1000)); // Convierte la diferencia de milisegundos a días

        double modulo = barco.calcularModulo();
        double precioAlquiler = modulo * diasOcupacion;

        return precioAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler: " + nombre + ", DNI: " + dni + ", Fecha de alquiler: " + fechAlquiler + ", Fecha de Devolucion: " + fechaDevolucion + ", amarrado en palo: " + posAmarre + "° " + barco;
    }
}
