package Builder;

public class ServicioBuilder {
    private Servicio servicio;

    public ServicioBuilder() {
        this.servicio = new Servicio();
    }

    public ServicioBuilder setTipoServicio(String tipoServicio) {
        servicio.setTipoServicio(tipoServicio);
        return this;
    }

    public ServicioBuilder setFecha(String fecha) {
        servicio.setFecha(fecha);
        return this;
    }

    public ServicioBuilder setDuracionHoras(int horas) {
        servicio.setDuracionHoras(horas);
        return this;
    }

    public ServicioBuilder setCostoEstimado(double costo) {
        servicio.setCostoEstimado(costo);
        return this;
    }

    public ServicioBuilder setIncluyeProductos(boolean incluye) {
        servicio.setIncluyeProductos(incluye);
        return this;
    }

    public ServicioBuilder setGarantiaIncluida(boolean garantia) {
        servicio.setGarantiaIncluida(garantia);
        return this;
    }

    public Servicio build() {
        return servicio;
    }
}
