package ar.edu.ort.p1.tp1.act14.classes;

public class SalonGerente extends EmpleadoSalon {

	private int cantPersonasACargo;

	public SalonGerente(String nombre, int legajo, String fechaIngreso, String horarioEntreda, String horarioSalida,
			int cantPersonasACargo) {
		super(nombre, legajo, fechaIngreso, horarioEntreda, horarioSalida);
		this.cantPersonasACargo = cantPersonasACargo;
	}

}
