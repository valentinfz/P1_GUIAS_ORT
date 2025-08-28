package ar.edu.ort.p1.tp1.act14.classes;

import ar.edu.ort.p1.tp1.act14.enums.TipoCategoria;

public class SalonMozo extends EmpleadoSalon {

	private TipoCategoria categoria;

	public SalonMozo(String nombre, int legajo, String fechaIngreso, String horarioEntreda, String horarioSalida,
			TipoCategoria categoria) {
		super(nombre, legajo, fechaIngreso, horarioEntreda, horarioSalida);
		this.categoria = categoria;
	}

}
