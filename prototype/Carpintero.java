package prototype;

public class Carpintero implements Oficio {
    private String nombre;
    private int experiencia; // años

    public Carpintero(String nombre, int experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    @Override
    public Oficio clone() {
        try {
            return (Oficio) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carpintero: " + nombre + ", experiencia: " + experiencia + " años.");
    }
}
