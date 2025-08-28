package ar.edu.ort.p1.tp1.act14.classes;

import java.util.ArrayList;
import java.util.List;

public class CocinaCocinero extends EmpleadoCocina {

	private int aniosDeExperiencia;
	private List<Pedido> pedidosEncargados;

	public CocinaCocinero(String nombre, int legajo, String fechaIngreso, String nombreAseguradoraART,
			int aniosDeExperiencia) {
		super(nombre, legajo, fechaIngreso, nombreAseguradoraART);
		this.aniosDeExperiencia = aniosDeExperiencia;
		this.pedidosEncargados = new ArrayList<Pedido>();
	}

	public void asignarPedido(Pedido pedido) {
		this.pedidosEncargados.add(pedido);
	}

	public boolean mismoLegajo(int legajo) {
		return this.getLegajo() == legajo;
	}

	public void mostrarPedidos() {
		for (Pedido pedido : this.pedidosEncargados) {
			System.out.println(pedido);
		}
	}

}
