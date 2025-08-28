package ar.edu.ort.p1.tp1.act12.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act12.interfaces.Notificable;

public class DiaTesteo implements Notificable {

	private static final int CANT_MAXIMA_TESTEOS = 5; // Bajo el numero para hacer pruebas

	private String fecha;
	private boolean esDiaHabil;
	private List<Persona> personas;

	public DiaTesteo(String fecha, boolean esDiaHabil) {
		this.fecha = fecha;
		this.esDiaHabil = esDiaHabil;
		this.personas = new ArrayList<Persona>();
	}

	public int getCantPersonas() {
		return this.personas.size();
	}

	public static int getCantMaximaTesteos() {
		return CANT_MAXIMA_TESTEOS;
	}

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	public boolean maximoTesteosAlcanzado() {
		return this.personas.size() > DiaTesteo.CANT_MAXIMA_TESTEOS;
	}

	public double promedioEdadPersonasSinOS() {
		int sumaEdades = 0;
		int cantEdades = 0;
		double promedio = 0;

		for (Persona persona : this.personas) {
			if (!(persona instanceof PersonaConObraSocial)) {
				sumaEdades += persona.getEdad();
				cantEdades++;
			}
		}
		if (cantEdades > 0) {
			promedio = sumaEdades / cantEdades;
		}
		return promedio;
	}

	public int obtenerCantPrioritarios() {
		int cantPrioritarios = 0;

		for (Persona persona : personas) {
			if (persona.esPriorizable()) {
				cantPrioritarios++;
			}
		}
		return cantPrioritarios;
	}

	@Override
	public void notificar(String mensaje) {
		for (int i = DiaTesteo.CANT_MAXIMA_TESTEOS; i < this.personas.size(); i++) {
			System.out.println(mensaje);
		}
	}

	@Override
	public String toString() {
		return "DiaTesteo [fecha=" + fecha + ", esDiaHabil=" + esDiaHabil + ", personas=" + personas + "]";
	}

}
