package prototype;

// Main.java
public class Main {
    public static void main(String[] args) {
        RegistroPrototipos registro = new RegistroPrototipos();

        Carpintero carpinteroBase = new Carpintero("Juan", 5);
        Plomero plomeroBase = new Plomero("Carlos", true);

        registro.agregarPrototipo("carpintero", carpinteroBase);
        registro.agregarPrototipo("plomero", plomeroBase);

        Oficio carpinteroContratado = registro.obtenerPrototipo("carpintero");
        Oficio plomeroContratado = registro.obtenerPrototipo("plomero");

        carpinteroContratado.mostrarInfo();
        plomeroContratado.mostrarInfo();

        Oficio otroCarpintero = registro.obtenerPrototipo("carpintero");
        otroCarpintero.mostrarInfo();
    }
}
