//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage garage =new Garage(4);

        Vehiculo coche1 = new Coche("2024FFSD", "DODGE", 4);
        Vehiculo coche2 = new Coche("2024FgSD", "FORD", 4);
        Vehiculo moto1 = new Motocicleta("2024GFDS", "Suzuki", true);
        Vehiculo moto2 = new Motocicleta("2024SDRF", "Kawasaki", true);
        Vehiculo coche3 = new Coche("2024JHFD", "CHEVY", 2);

        garage.estacionar(coche1);
        garage.estacionar(moto1);
        garage.estacionar(coche2);

        boolean retirado = garage.retirar("2024GFDS");
        System.out.println("Motocicleta retirada: " + retirado);

        System.out.println("Vehículos estacionados en el garaje: " +
                garage.contarVehiculos());

    }
}