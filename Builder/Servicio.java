package Builder;

public class Servicio {
    private String tipoServicio;
    private String fecha;
    private int duracionHoras;
    private double costoEstimado;
    private boolean incluyeProductos;
    private boolean garantiaIncluida;

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void setCostoEstimado(double costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public void setIncluyeProductos(boolean incluyeProductos) {
        this.incluyeProductos = incluyeProductos;
    }

    public void setGarantiaIncluida(boolean garantiaIncluida) {
        this.garantiaIncluida = garantiaIncluida;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "tipoServicio='" + tipoServicio + '\'' +
                ", fecha='" + fecha + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", costoEstimado=" + costoEstimado +
                ", incluyeProductos=" + incluyeProductos +
                ", garantiaIncluida=" + garantiaIncluida +
                '}';
    }
}
