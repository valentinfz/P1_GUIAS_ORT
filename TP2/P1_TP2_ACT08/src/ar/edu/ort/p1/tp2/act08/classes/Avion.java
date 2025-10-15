package ar.edu.ort.p1.tp2.act08.classes;

import java.util.Arrays;

import ar.edu.ort.p1.tp2.act08.enums.TipoEstado;

public class Avion {

	private static final int CANT_FILAS = 16;
	private static final int CANT_COLUMNAS = 6;

	private String marca;
	private Asiento[][] asientos;

	public Avion(String marca) {
		this.marca = marca;
		this.asientos = new Asiento[CANT_FILAS][CANT_COLUMNAS];
		this.inicializarAsientos();
	}

	public void mostrarAsientos() {
		System.out.println("Mapa de asientos (" + marca + "):");
		for (int i = 0; i < CANT_FILAS; i++) {
			for (int j = 0; j < CANT_COLUMNAS; j++) {
				System.out.print(asientos[i][j].simboloDeAsiento() + "\t");
			}
			System.out.println();
		}
	}

	public int asientosLibresConVentanilla() {
		int[] columnasVentana = { 0, CANT_COLUMNAS - 1 };
		int cantidad = 0;
		int columna;

		for (int i = 0; i < CANT_FILAS; i++) {
			for (int j = 0; j < columnasVentana.length; j++) {
				columna = columnasVentana[j];
				if (asientos[i][columna].estaDisponible()) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

	// Uso una condicion en el for para cortar cuando lo encuentre
	public Asiento buscarAsiento(int numAsiento) {
		Asiento asientoEncontrado = null;

		for (int i = 0; i < CANT_FILAS && asientoEncontrado == null; i++) {
			for (int j = 0; j < CANT_COLUMNAS && asientoEncontrado == null; j++) {
				if (asientos[i][j].mismoNumero(numAsiento)) {
					asientoEncontrado = asientos[i][j];
				}
			}
		}
		return asientoEncontrado;
	}

	// Busco fila por fila (mas declarativo)
	public Asiento buscarAsientoV2(int numAsiento) {
		Asiento asientoEncontrado = null;

		for (int i = 0; i < CANT_FILAS; i++) {
			asientoEncontrado = this.buscarEnFila(asientos[i], numAsiento);
		}
		return asientoEncontrado;
	}

	private void inicializarAsientos() {
		int numero = 1;
		for (int i = 0; i < CANT_FILAS; i++) {
			for (int j = 0; j < CANT_COLUMNAS; j++) {
				asientos[i][j] = new Asiento(TipoEstado.LIBRE, numero++);
			}
		}
	}

	private Asiento buscarEnFila(Asiento[] filaDeAsientos, int numAsiento) {
		Asiento asientoEncontrado = null;

		for (int j = 0; j < CANT_COLUMNAS; j++) {
			if (filaDeAsientos[j].mismoNumero(numAsiento)) {
				asientoEncontrado = filaDeAsientos[j];
			}
		}
		return asientoEncontrado;
	}

	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", asientos=" + Arrays.toString(asientos) + "]";
	}

}
