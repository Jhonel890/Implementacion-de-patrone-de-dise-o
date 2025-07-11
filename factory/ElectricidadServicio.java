package factory;

public class ElectricidadServicio implements Servicio {
    @Override
    public void mostrarDetalles() {
        System.out.println("🔹 Servicio de Electricidad: incluye cableado y revisión de enchufes.");
    }
}
