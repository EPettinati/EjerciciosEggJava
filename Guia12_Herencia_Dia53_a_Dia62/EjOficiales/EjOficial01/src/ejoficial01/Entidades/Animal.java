package ejoficial01.Entidades;

public class Animal {
    protected String nombre;
    protected String alimento;
    protected byte edad;
    protected String razaAnimal;

    public Animal() {
    }

    public Animal(String nombre, String alimento, byte edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }
    
    public void alimentarse() {
        System.out.println("El animal se alimenta de " + alimento);
    }
}
