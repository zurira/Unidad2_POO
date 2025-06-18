//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    EmpleadoTiempoCompleto empTC = new EmpleadoTiempoCompleto("202501", "Zuri", 10000, "\nVacaciones\nPrestaciones de ley\nAguinaldos\nSeguro médico");
    EmpleadoPorHoras empPH = new EmpleadoPorHoras("202502", "Saddai", 500, 10);

    empTC.calcularSalario();
    System.out.println("-----------------------------");
    empPH.calcularSalario();

    }
}