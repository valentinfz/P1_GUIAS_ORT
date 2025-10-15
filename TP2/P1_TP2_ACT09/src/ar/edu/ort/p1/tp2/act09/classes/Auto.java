package ar.edu.ort.p1.tp2.act09.classes;

import java.util.Arrays;

public class Auto {

	private static final int CANT_PAGOS = 12;

	private String patente;
	private Fecha fechaDeIngreso;
	private Pago[] pagos;

	public Auto(String patente, Fecha fechaDeIngreso) {
		this.patente = patente;
		this.fechaDeIngreso = fechaDeIngreso;
		this.pagos = new Pago[CANT_PAGOS];
	}

	public Fecha getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public boolean estaAlDia() {
		boolean alDia = true;
		int mesInicio = this.asignarMesDeInicio();

		if (this.pagoEsteMes(Fecha.hoy().getMes())) {
			for (int mes = mesInicio; mes <= Fecha.hoy().getMes(); mes++) {
				if (!this.pagoEsteMes(mes)) {
					alDia = false;
				}
			}
		} else {
			alDia = false;
		}
		return alDia;
	}

	public int cantidadDeDeudas() {
		int cantidad = 0;
		int mesDeInicio;

		if (!this.estaAlDia()) {
			mesDeInicio = this.asignarMesDeInicio();
			for (int i = mesDeInicio; i < Fecha.hoy().getMes(); i++) {
				if (!this.pagoEsteMes(i)) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", fechaDeIngreso=" + fechaDeIngreso + ", pagos=" + Arrays.toString(pagos)
				+ "]";
	}

	private boolean ingresoEsteAnio(Fecha fechaDeIngreso) {
		int anioActual = Fecha.hoy().getAnio();
		return fechaDeIngreso.getAnio() == anioActual;
	}

	private boolean pagoEsteMes(int mes) {
		return this.pagos[mes] != null;
	}

	private int asignarMesDeInicio() {
		int mesInicio;

		if (ingresoEsteAnio(this.fechaDeIngreso)) {
			mesInicio = this.fechaDeIngreso.getMes(); // desde el mes de ingreso
		} else {
			mesInicio = 1; // desde enero
		}
		return mesInicio;
	}

}
