package ar.edu.ort.p1.tp1.act08.classes;

public abstract class Empleado {

	public static final double SUELDO_FIJO = 20000;

	private String dni;
	private String nombreYApellido;
	private int anioDeIngreso;

	public Empleado(String dni, String nombreYApellido, int anioDeIngreso) {
		this.dni = dni;
		this.nombreYApellido = nombreYApellido;
		this.anioDeIngreso = anioDeIngreso;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombreYApellido=" + nombreYApellido + ", anioDeIngreso=" + anioDeIngreso
				+ "]";
	}

	public abstract double calcularSalario();

}
