package factory;

public class MainFactory {
    public static void main(String[] args) {
        ServicioFactoryMethod factoryMethod = new ServicioFactoryMethod();

        Servicio s1 = factoryMethod.crearServicio("limpieza");
        Servicio s2 = factoryMethod.crearServicio("plomeria");
        Servicio s3 = factoryMethod.crearServicio("electricidad");

        System.out.println("=== Servicios contratados ===");
        s1.mostrarDetalles();
        s2.mostrarDetalles();
        s3.mostrarDetalles();
    }
}
