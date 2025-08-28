package ar.edu.ort.p1.tp1.act14.classes;

public class CocinaChef extends EmpleadoCocina {

	private String titulo;

	public CocinaChef(String nombre, int legajo, String fechaIngreso, String nombreAseguradoraART, String titulo) {
		super(nombre, legajo, fechaIngreso, nombreAseguradoraART);
		this.titulo = titulo;
	}

}
