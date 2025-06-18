public class Garage {
    private final Vehiculo[] espacios;

    public Garage(int numEspacios) {
        if (numEspacios <= 0) {
            throw new IllegalArgumentException("El garaje debe tener al menos 1 espacio.");
        }
        this.espacios = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo v) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] == null) {
                espacios[i] = v;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(String placa) {
        for (int i = 0; i < espacios.length; i++) {
            Vehiculo actual = espacios[i];
            if (actual != null && actual.getPlaca().equalsIgnoreCase(placa)) {
                espacios[i] = null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculos() {
        int conteo = 0;
        for (Vehiculo v : espacios) {
            if (v != null) conteo++;
        }
        return conteo;
    }
}

