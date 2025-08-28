package ar.edu.ort.p1.tp1.act14.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act14.enums.EstadoMesa;
import ar.edu.ort.p1.tp1.act14.enums.TipoMetodoPago;

public class Mesa {

	private int numero;
	private int cantPersonas;
	private EstadoMesa estado;
	private List<Pedido> pedidos;

	public Mesa(int numero, int cantPersonas, EstadoMesa estado) {
		this.numero = numero;
		this.cantPersonas = cantPersonas;
		this.estado = estado;
		this.pedidos = new ArrayList<Pedido>();
	}

	public void agregarPedido(Pedido pedido) {
		if (this.estaLibre()) {
			this.ocupar();
		}
		this.pedidos.add(pedido);
	}

	public void habilitarMesa() {
		this.estado = EstadoMesa.LIBRE;
		this.pedidos.clear();
	}

	public boolean mismoNumero(int numero) {
		return this.numero == numero;
	}

	public double obtenerMontoTotal() {
		double montoTotal = 0;

		for (Pedido pedido : this.pedidos) {
			montoTotal += pedido.obtenerMontoFinal();
		}
		return montoTotal;
	}

	public Pedido pedidoConMasBebidas(TipoMetodoPago metodoPago) {
		Pedido mejor = null;
		int cantMax = -1;
		int cantActual;

		for (Pedido actual : this.pedidos) {
			if (actual.mismoMetodoPago(metodoPago)) {
				cantActual = actual.obtenerCantidadBebidas();
				if (cantActual > cantMax) {
					cantMax = cantActual;
					mejor = actual;
				}
			}
		}
		return mejor;
	}

	private void ocupar() {
		this.estado = EstadoMesa.OCUPADA;
	}

	private boolean estaLibre() {
		return this.estado == EstadoMesa.LIBRE;
	}

}
