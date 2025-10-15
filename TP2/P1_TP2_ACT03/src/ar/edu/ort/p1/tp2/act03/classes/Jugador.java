package ar.edu.ort.p1.tp2.act03.classes;

import ar.edu.ort.p1.tp2.act03.enums.TipoPosicion;

public class Jugador {

	private String apellido;
	private int numero;
	private TipoPosicion tipoPosicion;

	public Jugador(String apellido, int numero, TipoPosicion tipoPosicion) {
		this.apellido = apellido;
		this.numero = numero;
		this.tipoPosicion = tipoPosicion;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNumero() {
		return numero;
	}

	public TipoPosicion getTipoPosicion() {
		return tipoPosicion;
	}

	public boolean mismoNumero(int numero) {
		return this.numero == numero;
	}

	@Override
	public String toString() {
		return "Jugador [apellido=" + apellido + ", numero=" + numero + ", tipoPosicion=" + tipoPosicion + "]";
	}

}
