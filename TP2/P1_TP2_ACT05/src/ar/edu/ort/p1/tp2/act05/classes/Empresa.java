package ar.edu.ort.p1.tp2.act05.classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private static final int CANT_CAMIONES = 10;
	private static final int CANT_CHOFERES = 20;

	private Camion[] camiones;
	private Chofer[] choferes;
	private List<Viaje> viajes;

	public Empresa() {
		this.camiones = new Camion[CANT_CAMIONES];
		this.choferes = new Chofer[CANT_CHOFERES];
		this.viajes = new ArrayList<Viaje>();
	}

	public void agregarCamion(Camion camion) {
		boolean camionColocado = false;
		int i = 0;
		while (i < this.camiones.length && camionColocado == false) {
			if (this.camiones[i] == null) {
				this.camiones[i] = camion;
				camionColocado = true;
			} else {
				i++;
			}
		}
		if (camionColocado) {
			System.out.println(camion + " colocado correctamente");
		} else {
			System.out.println("No hay mas espacio disponible");
		}
	}

	public void agregarChofer(Chofer chofer) {
		boolean choferColocado = false;
		int i = 0;
		while (i < this.choferes.length && choferColocado == false) {
			if (this.choferes[i] == null) {
				this.choferes[i] = chofer;
				choferColocado = true;
			} else {
				i++;
			}
		}
		if (choferColocado) {
			System.out.println(chofer + " colocado correctamente");
		} else {
			System.out.println("No hay mas espacio disponible");
		}
	}

	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}

	public void mostrarCostosDeViajes() {
		double[] costos = this.obtenerCostosDeViajes();
		for (double costo : costos) {
			System.out.println(" - $" + costo);
		}
	}

	public void mostrarViajesXChoferCamion() {
		int[][] resultado = this.obtenerViajesXChoferCamion();

		for (int i = 0; i < this.choferes.length; i++) {
			for (int j = 0; j < this.camiones.length; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println(); // Salto de linea por fila
		}
	}

	private double[] obtenerCostosDeViajes() {
		double[] costoPorViaje = new double[this.viajes.size()];
		double total;
		Viaje viaje;
		Chofer chofer;
		Camion camion;

		for (int i = 0; i < this.viajes.size(); i++) {
			viaje = this.viajes.get(i);
			chofer = this.choferes[this.buscarPosicion(viaje.getIdChofer())];
			camion = this.camiones[viaje.getIdCamion()];
			total = chofer.getPagoPorViaje() + viaje.calcularCosto(camion.getCostoPorKm());
			costoPorViaje[i] = total;
		}
		return costoPorViaje;
	}

	private int[][] obtenerViajesXChoferCamion() {
		int[][] matrizDeregistros = new int[CANT_CHOFERES][CANT_CAMIONES];
		int posChofer;
		int posCamion;

		for (Viaje viaje : this.viajes) {
			posChofer = this.buscarPosicion(viaje.getIdChofer());
			posCamion = viaje.getIdCamion();
			matrizDeregistros[posChofer][posCamion]++;
		}
		return matrizDeregistros;
	}

	private int buscarPosicion(String idChofer) {
		int posicionEncontrada = -1;
		int i = 0;

		while (i < this.choferes.length && posicionEncontrada == -1) {
			if (this.choferes[i] != null && this.choferes[i].mismoChofer(idChofer)) {
				posicionEncontrada = i;
			} else {
				i++;
			}
		}
		return posicionEncontrada;
	}
}
