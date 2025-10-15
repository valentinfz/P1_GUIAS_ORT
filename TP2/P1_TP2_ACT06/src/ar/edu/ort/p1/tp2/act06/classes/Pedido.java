package ar.edu.ort.p1.tp2.act06.classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int idVendedor;
	private String cuitCliente;
	private List<Item> itemsPedidos;

	public Pedido(int idVendedor, String cuitCliente) {
		super();
		this.idVendedor = idVendedor; // Asumo que el id es la pos en el array
		this.cuitCliente = cuitCliente;
		this.itemsPedidos = new ArrayList<Item>();
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public String getCuitCliente() {
		return cuitCliente;
	}

	public void agregarItem(Item item) {
		this.itemsPedidos.add(item);
	}

	public boolean mismoVendedor(int idVendedor) {
		return this.idVendedor == idVendedor;
	}

	public double calcularTotalPedido() {
		double totalPedido = 0;

		for (Item item : this.itemsPedidos) {
			totalPedido += item.obtenerTotal();
		}
		return totalPedido;
	}

	@Override
	public String toString() {
		return "Pedido [idVendedor=" + idVendedor + ", cuitCliente=" + cuitCliente + ", itemsPedidos=" + itemsPedidos
				+ "]";
	}

}
