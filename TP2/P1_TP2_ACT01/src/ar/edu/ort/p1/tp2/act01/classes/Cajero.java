package ar.edu.ort.p1.tp2.act01.classes;

import java.util.ArrayList;
import java.util.List;

public class Cajero {

	private int id;
	private String apellido;
	private int antiguedad;
	private List<Pedido> pedidos;

	public Cajero(int id, String apellido, int antiguedad) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.pedidos = new ArrayList<Pedido>();
	}

	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public double montosPorCajero() {
		double monto = 0;

		for (Pedido pedido : this.pedidos) {
			monto += pedido.getMonto();
		}
		return monto;
	}

}
