package Ejercicio21_empleadosContratacion;

public class Empleado {
    private String nombre;
    private String dni;
    private int legajo;

    public Empleado(String nombre, String dni, int legajo) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
    }

    public double calcularSalario() {
        return 0;
    }

    public void mostrarInformacion() {
        System.out.println("Legajo " + legajo + " - " + nombre + " (DNI " + dni + ")");
    }

    public String getNombre() {
        return nombre;
    }
}
