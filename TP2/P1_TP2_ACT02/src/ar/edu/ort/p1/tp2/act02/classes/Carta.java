package ar.edu.ort.p1.tp2.act02.classes;

import ar.edu.ort.p1.tp2.act02.enums.Palo;

public class Carta {

	private Palo palo;
	private int numero;

	public Carta(Palo palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}

}