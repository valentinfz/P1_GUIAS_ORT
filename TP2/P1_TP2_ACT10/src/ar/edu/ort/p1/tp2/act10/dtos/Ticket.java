package ar.edu.ort.p1.tp2.act10.dtos;

import ar.edu.ort.p1.tp2.act10.classes.Fecha;

public class Ticket {

	private Fecha fecha;
	private String tituloPelicula;
	private String nombreEspectador;

	public Ticket(Fecha fecha, String tituloPelicula, String nombreEspectador) {
		this.fecha = fecha;
		this.tituloPelicula = tituloPelicula;
		this.nombreEspectador = nombreEspectador;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", titulo=" + tituloPelicula + ", espectador=" + nombreEspectador + "]";
	}
}
