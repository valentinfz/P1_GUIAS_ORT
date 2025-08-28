package ar.edu.ort.p1.tp1.act14.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act14.enums.TipoMetodoPago;

public class Pedido {
	private Mesa mesa;
	private SalonMozo mozo;
	private CocinaCocinero cocinero;
	private TipoMetodoPago metodoPago;
	private List<Item> productos;

	public Pedido(Mesa mesa, SalonMozo mozo, CocinaCocinero cocinero, TipoMetodoPago metodoPago) {
		this.mesa = mesa;
		this.mozo = mozo;
		this.cocinero = cocinero;
		this.metodoPago = metodoPago;
		this.productos = new ArrayList<Item>();
		this.mesa.agregarPedido(this); // Agregar el pedido a la mesa
	}

	public void agregarProducto(Item producto) {
		this.productos.add(producto);
	}

	public boolean mismoMetodoPago(TipoMetodoPago metodoPago) {
		return this.metodoPago == metodoPago;
	}

	public double obtenerMontoFinal() {
		double montoFinal = 0;

		for (Item item : this.productos) {
			montoFinal += item.calcularPrecioFinal(this.metodoPago);
		}
		return montoFinal;
	}

	public int obtenerCantidadBebidas() {
		int cantidad = 0;

		for (Item item : this.productos) {
			if (item instanceof ItemBebida) {
				cantidad++;
			}
		}
		return cantidad;
	}

}
