package ar.edu.ort.p1.tp2.act04.classes;

import ar.edu.ort.p1.tp2.act04.interfaces.Calculable;

public class Reserva implements Calculable {

	private String codigo;
	private int cantPersonas;
	private Recorrido recorrido;

	public Reserva(String codigo, int cantPersonas, Recorrido recorrido) {
		this.codigo = codigo;
		this.cantPersonas = cantPersonas;
		this.recorrido = recorrido;
	}

	public Recorrido getRecorrido() {
		return recorrido;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	@Override
	public double calcularPrecio() {
		return this.recorrido.calcularPrecio() * this.cantPersonas;
	}

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", cantPersonas=" + cantPersonas + ", recorrido=" + recorrido + "]";
	}

}
