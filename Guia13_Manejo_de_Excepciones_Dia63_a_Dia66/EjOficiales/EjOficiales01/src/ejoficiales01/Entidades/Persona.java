package ejoficiales01.Entidades;

/*
 Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. 
Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
*/

public class Persona {
    private String nombre;
    private Integer edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona03{" + "El nombre es: " + nombre + ", la edad es : " + edad + ", sexo: " + sexo + ", su peso es: " + peso + ", su altura es:  " + altura + '}';
    }
    
    
}
