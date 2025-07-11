package prototype;

import java.util.HashMap;

public class RegistroPrototipos {
    private HashMap<String, Oficio> prototipos = new HashMap<>();

    public void agregarPrototipo(String clave, Oficio oficio) {
        prototipos.put(clave, oficio);
    }

    public Oficio obtenerPrototipo(String clave) {
        Oficio prototipo = prototipos.get(clave);
        if (prototipo != null) {
            return prototipo.clone();
        }
        return null;
    }
}

