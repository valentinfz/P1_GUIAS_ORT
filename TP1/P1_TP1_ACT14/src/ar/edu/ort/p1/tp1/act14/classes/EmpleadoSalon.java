package ar.edu.ort.p1.tp1.act14.classes;

public abstract class EmpleadoSalon extends Empleado {

	private String horarioEntreda;
	private String horarioSalida;

	public EmpleadoSalon(String nombre, int legajo, String fechaIngreso, String horarioEntreda, String horarioSalida) {
		super(nombre, legajo, fechaIngreso);
		this.horarioEntreda = horarioEntreda;
		this.horarioSalida = horarioSalida;
	}
}
