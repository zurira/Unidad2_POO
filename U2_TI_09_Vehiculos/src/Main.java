//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Garage[] garage =new Garage[4];
    Garage ga1 = new Garage();
    Garage ga2 = new Garage();
    Garage ga3 = new Garage();
    Garage ga4 = new Garage();
    Coche coche1 = new Coche("2024FFSD", "DODGE", 4);
    coche1.estacionar();
    Coche coche2 = new Coche("2024FgSD", "FORD", 4);
    Motocicleta moto1 = new Motocicleta("2024GFDS", "Suzuki", true);
    Motocicleta moto2 = new Motocicleta("2024SDRF", "Kawasaki", true);
    Coche coche3 = new Coche("2024JHFD", "CHEVY", 2);

    garage[0]=ga1;
    garage[1]=ga2;



    }
}