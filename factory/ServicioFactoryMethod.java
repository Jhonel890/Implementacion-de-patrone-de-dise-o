package factory;

public class ServicioFactoryMethod {
    public Servicio crearServicio(String tipo) {
        ServicioFactory factory;

        switch (tipo.toLowerCase()) {
            case "limpieza":
                factory = () -> new LimpiezaServicio();
                break;
            case "plomeria":
                factory = () -> new PlomeriaServicio();
                break;
            case "electricidad":
                factory = () -> new ElectricidadServicio();
                break;
            default:
                throw new IllegalArgumentException("Tipo de servicio no válido");
        }

        return factory.crearServicio();
    }
}
