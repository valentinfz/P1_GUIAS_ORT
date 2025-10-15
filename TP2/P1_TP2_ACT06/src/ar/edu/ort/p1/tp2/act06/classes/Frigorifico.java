package ar.edu.ort.p1.tp2.act06.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp2.act06.enums.TipoPais;

public class Frigorifico {

	private static final int CANT_VENDEDORES = 20;

	private Vendedor[] vendedores;
	private List<Pedido> pedidos;
	private List<Cliente> clientes;

	public Frigorifico() {
		this.vendedores = new Vendedor[CANT_VENDEDORES];
		this.pedidos = new ArrayList<Pedido>();
		this.clientes = new ArrayList<Cliente>();
	}

	public void agregarVendedor(Vendedor vendedor) {
		boolean vendedorColocado = false;
		int i = 0;

		while (i < this.vendedores.length && vendedorColocado == false) {
			if (this.vendedores[i] == null) {
				this.vendedores[i] = vendedor;
				vendedorColocado = true;
			} else {
				i++;
			}
		}
		if (vendedorColocado) {
			System.out.println(vendedor + " colocado correctamente");
		} else {
			System.out.println("No hay mas espacio disponible");
		}
	}

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public void informarCantPedidos() {
		int[][] resultado = new int[CANT_VENDEDORES][TipoPais.values().length];

		this.calcularValores(resultado);
		this.mostrarResultados(resultado);

	}

	public void mostrarClientesPorPais() {
		int[] cantidades = clientesPorPais();

		for (int i = 0; i < TipoPais.values().length; i++) {
			System.out.println(TipoPais.values()[i] + ": " + cantidades[i] + " clientes");
		}
	}

	public String paisMasRentable() {
		double[] recaudacion = calcularRecaudacionPorPais();
		int posMax = indicePaisMasRentable(recaudacion);
		return TipoPais.values()[posMax].name();
	}

	private void calcularValores(int[][] matriz) {
		int idVendedor;
		Cliente cliente;
		TipoPais pais;

		for (Pedido pedido : this.pedidos) {
			idVendedor = pedido.getIdVendedor();
			cliente = this.buscarCliente(pedido.getCuitCliente());
			pais = cliente.getPais();
			matriz[idVendedor][pais.ordinal()]++;
		}
	}

	private void mostrarResultados(int[][] matriz) {
		String nombreVendedor;
		String nombrePais;
		int cantidad;

		for (int i = 0; i < CANT_VENDEDORES; i++) {
			for (int j = 0; j < TipoPais.values().length; j++) {
				if (this.vendedores[i] != null) {
					nombreVendedor = this.vendedores[i].getNombre();
					nombrePais = TipoPais.values()[j].toString();
					cantidad = matriz[i][j];
					System.out.println("El vendor " + nombreVendedor + " vendio " + cantidad + " pedidos para el pais "
							+ nombrePais);
				}
			}
		}
	}

	private void acumularRecaudacionPedido(double[] arrayDerecaudacion, Pedido pedido) {
		Cliente cliente = this.buscarCliente(pedido.getCuitCliente());
		double totalPedido;
		int posicion;

		if (cliente != null) {
			totalPedido = calcularTotalPedido(pedido);
			posicion = cliente.getPais().ordinal();
			arrayDerecaudacion[posicion] += totalPedido;
		}
	}

	private double calcularTotalPedido(Pedido pedido) {
		return pedido.calcularTotalPedido();
	}

	private int indicePaisMasRentable(double[] arrayDeRecaudacion) {
		int posMax = 0;
		double max = arrayDeRecaudacion[0];

		for (int i = 1; i < arrayDeRecaudacion.length; i++) {
			if (arrayDeRecaudacion[i] > max) {
				max = arrayDeRecaudacion[i];
				posMax = i;
			}
		}
		return posMax;
	}

	private Cliente buscarCliente(String cuit) {
		Cliente clienteEncontrado = null;
		Cliente cliente;
		int i = 0;

		while (i < this.clientes.size() && clienteEncontrado == null) {
			cliente = this.clientes.get(i);
			if (cliente.mismoCuit(cuit)) {
				clienteEncontrado = cliente;
			} else {
				i++;
			}
		}
		return clienteEncontrado;
	}

	private double[] calcularRecaudacionPorPais() {
		double[] recaudacion = new double[TipoPais.values().length];

		for (Pedido pedido : this.pedidos) {
			this.acumularRecaudacionPedido(recaudacion, pedido);
		}

		return recaudacion;
	}

	// Sumamos en la posicion del arrayDeCantidades que nos de el ordinal()
	private int[] clientesPorPais() {
		int[] arrayDeCantidades = new int[TipoPais.values().length];
		int posicion;

		for (Cliente cliente : this.clientes) {
			if (cliente != null) {
				posicion = cliente.getPais().ordinal();
				arrayDeCantidades[posicion]++;
			}
		}
		return arrayDeCantidades;
	}

}
