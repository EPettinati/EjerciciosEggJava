package ejlectura.entidades;

import java.util.ArrayList;
import java.util.List;

public class EJJugador02 {
    public class Jugador {
        private String nombre;
        private String apellido;
        private String posicion;
        private byte numero;

        public Jugador() {
        }

        public Jugador(String nombre, String apellido, String posicion, byte numero) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.posicion = posicion;
            this.numero = numero;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getPosicion() {
            return posicion;
        }

        public void setPosicion(String posicion) {
            this.posicion = posicion;
        }

        public byte getNumero() {
            return numero;
        }

        public void setNumero(byte numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return nombre + ", " + apellido + ", Posicion: " + posicion + ", Numero: " + numero;
        } 
    }
    
    public class Equipo {
    private List<Jugador> jugadores;

    public Equipo() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
}
