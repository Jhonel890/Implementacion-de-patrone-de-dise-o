package factory;

public class LimpiezaServicio implements Servicio {
    @Override
    public void mostrarDetalles() {
        System.out.println("🔹 Servicio de Limpieza: incluye productos y limpieza profunda.");
    }
}