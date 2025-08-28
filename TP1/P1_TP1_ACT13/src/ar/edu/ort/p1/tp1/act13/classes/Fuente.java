package ar.edu.ort.p1.tp1.act13.classes;

import ar.edu.ort.p1.tp1.act13.interfaces.Calificable;

public abstract class Fuente implements Calificable {

	private String nombre;
	private String ruta;

	public Fuente(String nombre, String ruta) {
		this.nombre = nombre;
		this.ruta = ruta;
	}

	// Metodo basura para evitar instanceof
	public Metodo buscarMetodo(String nombre) {
		return null;
	}

	@Override
	public String toString() {
		return "Fuente [nombre=" + nombre + ", ruta=" + ruta + "]";
	}

}
