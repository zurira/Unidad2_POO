public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;

    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int horasTrabajadas) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        System.out.println("ID de empleado: " +getId());
        System.out.println("Nombre de empleado: " +getNombre());
        System.out.println("Salario: " +getSalarioBase());
        System.out.println("Horas trabajadas: " +horasTrabajadas);
        System.out.println("Salario final: " +getSalarioBase()*horasTrabajadas);
        return getSalarioBase()*horasTrabajadas;
    }
}
