package ar.edu.ort.p1.tp2.act10.classes;

import java.time.LocalDate;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	// Devuelve la fecha actual
	public static Fecha hoy() {
		LocalDate hoy = LocalDate.now();
		return new Fecha(hoy.getDayOfMonth(), hoy.getMonthValue(), hoy.getYear());
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}

}
