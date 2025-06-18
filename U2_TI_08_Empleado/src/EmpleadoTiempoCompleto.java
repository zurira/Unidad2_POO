public class EmpleadoTiempoCompleto extends Empleado{

    private String beneficios;

    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
        super(id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public double calcularSalario() {
        //double salarioBase=super.getSalarioBase();
        System.out.println("ID de empleado: " +getId());
        System.out.println("Nombre de empleado: " +getNombre());
        System.out.printf("Salario base: " +getSalarioBase());
        System.out.println("\nBeneficios: " +getBeneficios());
        return getSalarioBase();
    }
}
