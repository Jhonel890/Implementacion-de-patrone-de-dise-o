package prototype;

public class Plomero implements Oficio {
    private String nombre;
    private boolean certificado;

    public Plomero(String nombre, boolean certificado) {
        this.nombre = nombre;
        this.certificado = certificado;
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
        System.out.println("Plomero: " + nombre + ", certificado: " + (certificado ? "Sí" : "No"));
    }
}
