public class Persona {
    private String nombre;
    private  int dni;
    private  byte edad;
    private  String pase;

    public Persona(String nombre, int dni, byte edad, String pase) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.pase = pase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public byte getEdad() {
        return edad;
    }

    public String getPase() {
        return pase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setPase(String pase) {
        this.pase = pase;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                ", pase='" + pase + '\'' +
                '}';
    }
}
