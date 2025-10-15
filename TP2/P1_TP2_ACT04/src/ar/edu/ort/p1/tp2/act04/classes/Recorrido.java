package ar.edu.ort.p1.tp2.act04.classes;

import ar.edu.ort.p1.tp2.act04.enums.Estacion;
import ar.edu.ort.p1.tp2.act04.interfaces.Calculable;

public class Recorrido implements Calculable {

	private static final double PRECIO_POR_ESTACION = 50;

	private Estacion partida;
	private Estacion llegada;

	public Recorrido(Estacion partida, Estacion llegada) {
		this.partida = partida;
		this.llegada = llegada;
	}

	public boolean pasoPorLaEstacion(Estacion estacion) {
		int inicio;
		int fin;
		int posicion;

		// Determinar inicio y fin. Siempre el menor en inicio y el mayor en fin
		if (this.partida.ordinal() <= this.llegada.ordinal()) {
			inicio = this.partida.ordinal();
			fin = this.llegada.ordinal();
		} else {
			inicio = this.llegada.ordinal();
			fin = this.partida.ordinal();
		}
		// Obtengo la posicion de la estacion por parametro
		posicion = estacion.ordinal();
		// Revisá si la estación está en ese rango, significa que el tren pasa por ahí.
		return posicion >= inicio && posicion <= fin;
	}

	@Override
	public double calcularPrecio() {
		final double DESCUENTO = 0.80; // 20% de descuento
		double precioFinal = 0;
		double precioSubTotal = 0;
		int estacionesRecorridas = 0;

		if (this.llegada.ordinal() >= this.partida.ordinal()) {
			estacionesRecorridas = this.llegada.ordinal() - this.partida.ordinal();
		} else {
			estacionesRecorridas = this.partida.ordinal() - this.llegada.ordinal();
		}

		precioSubTotal = estacionesRecorridas * PRECIO_POR_ESTACION;

		if (esViajeCabeceraACabecera()) {
			precioFinal = precioSubTotal * DESCUENTO;
		} else {
			precioFinal = precioSubTotal;
		}
		return precioFinal;
	}

	private boolean esViajeCabeceraACabecera() {
		return (this.partida.ordinal() == 0 && this.llegada.ordinal() == Estacion.values().length - 1)
				|| (this.partida.ordinal() == Estacion.values().length - 1 && this.llegada.ordinal() == 0);
	}

}
