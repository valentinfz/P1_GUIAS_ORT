package ar.edu.ort.p1.tp1.act14.classes;

import ar.edu.ort.p1.tp1.act14.enums.TipoMetodoPago;

public abstract class Item {

	private String nombre;
	private double precio;

	public Item(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public final double calcularPrecioFinal(TipoMetodoPago metodoPago) {
		double descuento = this.calcularDescuento();
		double precioFinal = 0;

		if (metodoPago == TipoMetodoPago.EFECTIVO) {
			precioFinal = this.precio - (this.precio * descuento);
		} else {
			precioFinal = this.precio;
		}
		return precioFinal;
	}

	public abstract double calcularDescuento();

}
