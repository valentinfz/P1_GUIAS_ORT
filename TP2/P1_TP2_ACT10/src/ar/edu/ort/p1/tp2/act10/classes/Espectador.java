package ar.edu.ort.p1.tp2.act10.classes;

public class Espectador {

	private String nombre;
	private int numeroCharla;

	public Espectador(String nombre, int numeroCharla) {
		this.nombre = nombre;
		this.numeroCharla = numeroCharla;
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", numeroCharla=" + numeroCharla + "]";
	}

}
