package Ejercicio21_empleadosContratacion;

public class Main {
    public static void main(String[] args) {
        Empleado fijo = new EmpleadoAsalariado("Laura Méndez", "28111222", 101, 950000.0);
        Empleado porHora = new EmpleadoPorHora("Diego Pérez", "35444555", 202, 4500.0, 120);

        fijo.mostrarInformacion();
        porHora.mostrarInformacion();

        double total = fijo.calcularSalario() + porHora.calcularSalario();
        System.out.println("Total de sueldos a pagar: " + total);
    }
}
