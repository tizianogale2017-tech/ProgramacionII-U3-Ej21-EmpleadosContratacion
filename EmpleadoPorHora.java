package Ejercicio21_empleadosContratacion;

public class EmpleadoPorHora extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String dni, int legajo, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, dni, legajo);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Tipo: por hora | " + horasTrabajadas + " h x " + tarifaPorHora + " = " + calcularSalario());
    }
}
