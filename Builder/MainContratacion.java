package Builder;

public class MainContratacion {
    public static void main(String[] args) {
        Servicio servicio = new ServicioBuilder()
                .setTipoServicio("Limpieza profunda de hogar")
                .setFecha("2025-07-15")
                .setDuracionHoras(4)
                .setCostoEstimado(50.0)
                .setIncluyeProductos(true)
                .setGarantiaIncluida(false)
                .build();

        System.out.println("=== Detalles del Servicio Contratado ===");
        System.out.println(servicio);
    }
}
