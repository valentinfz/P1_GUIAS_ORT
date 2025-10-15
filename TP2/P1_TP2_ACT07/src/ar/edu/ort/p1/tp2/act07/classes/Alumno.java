package ar.edu.ort.p1.tp2.act07.classes;

public class Alumno {

	private String legajo;
	private String apellido;
	private int edad;

	public Alumno(String legajo, String apellido, int edad) {
		this.legajo = legajo;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getLegajo() {
		return legajo;
	}

	public String getApellido() {
		return apellido;
	}

	public boolean mismoLegajo(String legajo) {
		return this.legajo.equals(legajo);
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
