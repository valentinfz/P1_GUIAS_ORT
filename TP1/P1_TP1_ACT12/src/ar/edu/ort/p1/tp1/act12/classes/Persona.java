package ar.edu.ort.p1.tp1.act12.classes;

import ar.edu.ort.p1.tp1.act12.enums.TipoMotivo;
import ar.edu.ort.p1.tp1.act12.interfaces.Priorizable;

public class Persona implements Priorizable {

	private static final int EDAD_FIJADA = 60; // Es util hacer esto solo por un metodo?

	private String dni;
	private String nombreYApellido;
	private int edad;
	private TipoMotivo motivo;

	public Persona(String dni, String nombreYApellido, int edad, TipoMotivo motivo) {
		this.dni = dni;
		this.nombreYApellido = nombreYApellido;
		this.edad = edad;
		this.motivo = motivo;
	}

	public int getEdad() {
		return edad;
	}

	public boolean esMayor() {
		return this.edad >= Persona.EDAD_FIJADA;
	}

	public boolean tuvoContactoEstrecho() {
		return this.motivo == TipoMotivo.CONTACTO_ESTRECHO;
	}

	public boolean esPriorizable() {
		return this.valorPriorizable() == 1;
	}

	@Override
	public int valorPriorizable() {
		int valor = 0;

		if (!(this instanceof PersonaConObraSocial) || this.esMayor() || this.tuvoContactoEstrecho()) {
			valor = 1;
		} else {
			valor = 2;
		}
		return valor;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreYApellido=" + nombreYApellido + ", edad=" + edad + ", motivo=" + motivo
				+ "]";
	}

}
