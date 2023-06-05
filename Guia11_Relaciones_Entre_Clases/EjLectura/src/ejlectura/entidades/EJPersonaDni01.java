package ejlectura.entidades;

public class EJPersonaDni01 {

    public class Dni {

        private char serie;
        private int numero;

        public Dni() {
        }

        public Dni(char serie, int numero) {
            this.serie = serie;
            this.numero = numero;
        }

        public char getSerie() {
            return serie;
        }

        public int getNumero() {
            return numero;
        }

        @Override
        public String toString() {
            return ", DNI: " + serie + numero;
        }
        
        
    }

    public class Persona {

        private String nombre;
        private String apellido;
        private Dni dni;

        public Persona() {
        }

        public Persona(String nombre, String apellido, Dni dni) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
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

        public Dni getDni() {
            return dni;
        }

        public void setDni(Dni dni) {
            this.dni = dni;
        }

        @Override
        public String toString() {
            return "El nombre es: " + nombre + ", apellido: " + apellido + dni.toString();
        }
        
        
    }
}
