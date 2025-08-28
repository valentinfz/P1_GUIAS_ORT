package ar.edu.ort.p1.tp1.act14.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act14.enums.TipoMetodoPago;

public class Restaurante {

	private List<Mesa> mesas;
	private List<Empleado> empleados;
	private List<Item> menu;

	public Restaurante() {
		super();
		this.mesas = new ArrayList<Mesa>();
		this.empleados = new ArrayList<Empleado>();
		this.menu = new ArrayList<Item>();
	}

	public void agregarMesa(Mesa mesa) {
		this.mesas.add(mesa);
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void agregarItem(Item item) {
		this.menu.add(item);
	}

	public void mostrarPedidosDelCocinero(int legajo) {
		CocinaCocinero cocinero = this.buscarCocinero(legajo);
		cocinero.mostrarPedidos();
	}

	public void liberarMesa(int numero) {
		Mesa mesa = this.buscarMesa(numero);
		double montoTotal = mesa.obtenerMontoTotal();

		mesa.habilitarMesa();
		System.out.println(montoTotal);
		;
	}

	public Pedido pedidoConMasBebidas(TipoMetodoPago metodoPago) {
		int maxBebidas = -1;
		Pedido mejor = null;
		Pedido actual;

		for (Mesa mesa : mesas) {
			actual = mesa.pedidoConMasBebidas(metodoPago);

			if (actual != null && actual.obtenerCantidadBebidas() > maxBebidas) {
				maxBebidas = actual.obtenerCantidadBebidas();
				mejor = actual;
			}
		}
		return mejor;
	}

	private ArrayList<CocinaCocinero> filtrarPorCocineros() {
		ArrayList<CocinaCocinero> listaCocineros = new ArrayList<CocinaCocinero>();
		CocinaCocinero cocinero;

		for (Empleado empleado : this.empleados) {
			if (empleado instanceof CocinaCocinero) {
				cocinero = (CocinaCocinero) empleado;
				listaCocineros.add(cocinero);
			}
		}
		return listaCocineros;
	}

	private CocinaCocinero buscarCocinero(int legajo) {
		ArrayList<CocinaCocinero> listaCocineros = this.filtrarPorCocineros();
		int i = 0;
		CocinaCocinero cocinero;
		CocinaCocinero cocineroEncontrado = null;

		while (i < listaCocineros.size() && cocineroEncontrado == null) {
			cocinero = listaCocineros.get(i);
			if (cocinero.mismoLegajo(legajo)) {
				cocineroEncontrado = cocinero;
			} else {
				i++;
			}
		}
		return cocineroEncontrado;
	}

	private Mesa buscarMesa(int numero) {
		int i = 0;
		Mesa mesa;
		Mesa mesaEncontrada = null;

		while (i < this.mesas.size() && mesaEncontrada == null) {
			mesa = this.mesas.get(i);
			if (mesa.mismoNumero(numero)) {
				mesaEncontrada = mesa;
			} else {
				i++;
			}
		}
		return mesaEncontrada;
	}

}
