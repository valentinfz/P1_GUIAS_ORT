package ar.edu.ort.p1.tp1.act09.classes;

import ar.edu.ort.p1.tp1.act09.enums.Categoria;

public class Vehiculo {

	private String patente;
	private Categoria categoria;

	public Vehiculo(String patente, Categoria categoria) {
		super();
		this.patente = patente;
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", categoria=" + categoria + "]";
	}

}
