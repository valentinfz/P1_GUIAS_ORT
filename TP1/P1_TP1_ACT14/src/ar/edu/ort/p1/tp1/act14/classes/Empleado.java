package ar.edu.ort.p1.tp1.act14.classes;

public abstract class Empleado {

	private String nombre;
	private int legajo;
	private String fechaIngreso;

	public Empleado(String nombre, int legajo, String fechaIngreso) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.fechaIngreso = fechaIngreso;
	}

	public int getLegajo() {
		return legajo;
	}

}
