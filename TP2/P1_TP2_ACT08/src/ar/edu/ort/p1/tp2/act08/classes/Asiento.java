package ar.edu.ort.p1.tp2.act08.classes;

import ar.edu.ort.p1.tp2.act08.enums.TipoEstado;

public class Asiento {

	private TipoEstado estado;
	private int numero;

	public Asiento(TipoEstado estado, int numero) {
		this.estado = estado;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void asignarReservado() {
		this.estado = TipoEstado.RESERVADO;
	}

	public boolean mismoNumero(int numAsiento) {
		return this.numero == numAsiento;
	}

	public boolean estaDisponible() {
		return this.estado == TipoEstado.LIBRE;
	}

	public char simboloDeAsiento() {
		char simbolo;

		if (this.estado == TipoEstado.LIBRE) {
			simbolo = 'L';
		} else if (estado == TipoEstado.RESERVADO) {
			simbolo = 'R';
		} else {
			simbolo = 'O';
		}
		return simbolo;
	}

	@Override
	public String toString() {
		return "Asiento [estado=" + estado + ", numero=" + numero + "]";
	}

}
