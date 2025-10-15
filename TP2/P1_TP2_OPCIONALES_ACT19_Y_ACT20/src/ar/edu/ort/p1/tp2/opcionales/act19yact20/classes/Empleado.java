package ar.edu.ort.p1.tp2.opcionales.act19yact20.classes;

public class Empleado {

	private String dni;
	private String apellido;
	private double sueldo;

	public Empleado(String dni, String apellido, double sueldo) {
		this.dni = dni;
		this.apellido = apellido;
		this.sueldo = sueldo;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public boolean mismoDni(String dni) {
		return this.dni.equals(dni);
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", apellido=" + apellido + ", sueldo=" + sueldo + "]";
	}

}
