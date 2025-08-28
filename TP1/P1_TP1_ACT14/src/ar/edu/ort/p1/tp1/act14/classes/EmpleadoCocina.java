package ar.edu.ort.p1.tp1.act14.classes;

public abstract class EmpleadoCocina extends Empleado {

	private String nombreAseguradoraART;

	public EmpleadoCocina(String nombre, int legajo, String fechaIngreso, String nombreAseguradoraART) {
		super(nombre, legajo, fechaIngreso);
		this.nombreAseguradoraART = nombreAseguradoraART;
	}

}
