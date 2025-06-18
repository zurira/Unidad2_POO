public class Garage {
    private String[] vehiculo;

    public Garage(String[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Garage() {

    }

    public boolean estacionar(Vehiculo vehiculo) {

        return true;
    }

    public boolean retirar(String placa) {

    }

    public int contarVehiculos(){

    }

    public String[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String[] vehiculo) {
        this.vehiculo = vehiculo;
    }
}
