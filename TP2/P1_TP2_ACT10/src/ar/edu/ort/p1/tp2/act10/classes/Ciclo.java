package ar.edu.ort.p1.tp2.act10.classes;

import java.util.Arrays;
import java.util.List;

public class Ciclo {

	private static final int CANT_CICLOS = 2;
	private static final int CANT_PELICULAS = 5;

	private String titulo;
	private Fecha fechaInicio;
	private Pelicula[] peliculas;
	private Charla[][] charlas;

	public Ciclo(String titulo, List<String> titulos, Fecha fechaInicio, int maxEspectadores) {
		this.titulo = titulo;
		this.fechaInicio = fechaInicio;
		this.peliculas = new Pelicula[CANT_PELICULAS];
		this.charlas = new Charla[CANT_CICLOS][CANT_PELICULAS];

	}

	@Override
	public String toString() {
		return "Ciclo [titulo=" + titulo + ", fechaInicio=" + fechaInicio + ", peliculas=" + Arrays.toString(peliculas)
				+ ", charlas=" + Arrays.toString(charlas) + "]";
	}

}
