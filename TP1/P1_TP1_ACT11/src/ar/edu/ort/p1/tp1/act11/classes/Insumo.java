package ar.edu.ort.p1.tp1.act11.classes;

import ar.edu.ort.p1.tp1.act11.enums.TipoInsumo;
import ar.edu.ort.p1.tp1.act11.interfaces.Facturable;

public class Insumo implements Facturable {

	private static final double IVA = 21.0;

	private String nombre;
	private TipoInsumo tipo;
	private double porcentajeGanancia;
	private double precio;

	public Insumo(String nombre, TipoInsumo tipo, double porcentajeGanancia, double precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precio = precio;
	}

	@Override
	public double obtenerMontoDeFacturacion() {
		double conGanancia = Matematica.sumarPorcentaje(this.precio, this.porcentajeGanancia);
		return Matematica.sumarPorcentaje(conGanancia, Insumo.IVA);
	}

}
