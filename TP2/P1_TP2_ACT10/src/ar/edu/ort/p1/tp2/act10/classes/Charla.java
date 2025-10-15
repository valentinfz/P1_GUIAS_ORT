package ar.edu.ort.p1.tp2.act10.classes;

import java.util.Arrays;

public class Charla {

	private static final int CANT_ESPECTADORES = 50;

	private Fecha fecha;
	private Pelicula pelicula;
	private Espectador[] espectadores;
	private int cantRegistrados;

	public Charla(Fecha fecha, Pelicula pelicula) {
		this.fecha = fecha;
		this.pelicula = pelicula;
		this.espectadores = new Espectador[CANT_ESPECTADORES];
		this.cantRegistrados = 0;
	}

	@Override
	public String toString() {
		return "Charla [fecha=" + fecha + ", pelicula=" + pelicula + ", espectadores=" + Arrays.toString(espectadores)
				+ ", cantRegistrados=" + cantRegistrados + "]";
	}

}
