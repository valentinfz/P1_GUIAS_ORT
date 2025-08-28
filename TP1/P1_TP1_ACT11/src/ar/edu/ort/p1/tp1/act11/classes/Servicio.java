package ar.edu.ort.p1.tp1.act11.classes;

import ar.edu.ort.p1.tp1.act11.interfaces.Facturable;

public abstract class Servicio implements Facturable {

	public static final double IVA = 21.0;

	private double cantHoras;

	public Servicio(double cantHoras) {
		this.cantHoras = cantHoras;
	}

	public double getCantHoras() {
		return cantHoras;
	}

	public abstract double calcularPrecio();

}
