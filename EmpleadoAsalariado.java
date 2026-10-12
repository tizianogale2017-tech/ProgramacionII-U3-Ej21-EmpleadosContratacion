package Ejercicio21_empleadosContratacion;

public class EmpleadoAsalariado extends Empleado {
    private double sueldoMensual;

    public EmpleadoAsalariado(String nombre, String dni, int legajo, double sueldoMensual) {
        super(nombre, dni, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSalario() {
        return sueldoMensual;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Tipo: asalariado | Salario mensual: " + calcularSalario());
    }
}
