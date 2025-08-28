package ar.edu.ort.p1.tp1.act12.classes;

import java.util.ArrayList;
import java.util.List;

public class Centro {

	List<DiaTesteo> testeos;

	public Centro() {
		super();
		this.testeos = new ArrayList<DiaTesteo>();
	}

	public void agregarDiaTesteo(DiaTesteo testeo) {
		this.testeos.add(testeo);
	}

	public double revisar(String mensaje) {
		for (DiaTesteo testeo : testeos) {
			if (testeo.maximoTesteosAlcanzado()) {
				testeo.notificar(mensaje);
			}
		}
		return this.porcentajePersonasFuera();
	}

	public void mostrarDiaConMasPrioritarios() {
		System.out.println(this.obtenerDiaConMasPrioritarios());
	}

	private DiaTesteo obtenerDiaConMasPrioritarios() {
		DiaTesteo mejor = null;
		DiaTesteo actual;

		if (!this.testeos.isEmpty()) {
			mejor = this.testeos.get(0);
		}

		for (int i = 1; i < this.testeos.size(); i++) {
			actual = this.testeos.get(i);

			if (actual.obtenerCantPrioritarios() > mejor.obtenerCantPrioritarios()) {
				mejor = actual;
			}
		}
		return mejor;
	}

	private double porcentajePersonasFuera() {
		int totalPersonas = 0;
		int personasFuera = 0;
		double porcentajeFinal = 0;

		for (DiaTesteo testeo : testeos) {
			totalPersonas += testeo.getCantPersonas();
			if (testeo.maximoTesteosAlcanzado()) {
				personasFuera += testeo.getCantPersonas() - DiaTesteo.getCantMaximaTesteos();
			}
		}
		if (totalPersonas != 0) {
			porcentajeFinal = personasFuera * 100.0 / totalPersonas;
		}
		return porcentajeFinal;
	}

}
