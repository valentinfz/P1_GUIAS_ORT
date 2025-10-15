package ar.edu.ort.p1.tp2.act09.classes;

public class Estacionamiento {

	private static final int CANT_ESPACIOS = 6;
	private static final int CANT_PISOS = 8;

	private Auto[][] autos;

	public Estacionamiento() {
		this.autos = new Auto[CANT_PISOS][CANT_ESPACIOS];
		this.inicializar();
	}

	public void mostrarEstado() {
		Auto auto;

		for (int piso = 0; piso < this.autos.length; piso++) {
			for (int espacio = 0; espacio < this.autos[piso].length; espacio++) {
				auto = this.autos[piso][espacio];
				if (auto != null) {
					System.out.print(auto.getPatente() + "\t");
				} else {
					System.out.print("null\t"); // <-- mostrar explícitamente que está vacío
				}
			}
			System.out.println();
		}
	}

	public void mostrarAutosMasMorososPorPiso() {
		Auto[] masMorosos = this.autosMasMorososPorPiso();

		for (int i = 0; i < masMorosos.length; i++) {
			System.out.print("Piso " + i + ": ");
			if (masMorosos[i] != null) {
				System.out.println(masMorosos[i].getPatente());
			} else {
				System.out.println("(sin autos)");
			}
		}
	}

	public void agregarAuto(Auto auto) {
		boolean autoColocado = false;

		for (int piso = 0; piso < this.autos.length && !autoColocado; piso++) {
			for (int espacio = 0; espacio < this.autos[piso].length && !autoColocado; espacio++) {
				if (this.autos[piso][espacio] == null) {
					this.autos[piso][espacio] = auto;
					autoColocado = true;
					System.out.println(auto + " colocado correctamente en piso " + piso + ", espacio " + espacio);
				}
			}
		}
		if (!autoColocado) {
			System.out.println("No hay más espacio disponible en el estacionamiento");
		}
	}

	public Auto retirar(int posicion) { // Ej: posicion = 43
		int piso = posicion / 10; // da 4
		int espacio = posicion % 10; // da 3
		Auto autoRetirado = null;
		Auto auto;

		if (this.existeEnRango(piso, espacio)) {
			auto = this.buscarAuto(piso, espacio);
			if (auto != null) {
				if (auto.estaAlDia()) {
					this.remover(piso, espacio);
					autoRetirado = auto;
				} else {
					System.out.println("El auto no esta al dia");
				}
			} else {
				System.out.println("El auto es null");
			}
		} else {
			System.out.println("Rango no valido");
		}
		return autoRetirado;
	}

	private void inicializar() {
		for (int piso = 0; piso < this.autos.length; piso++) {
			for (int espacio = 0; espacio < this.autos[piso].length; espacio++) {
				this.autos[piso][espacio] = null;
			}
		}
	}

	private void remover(int piso, int espacio) {
		this.autos[piso][espacio] = null;
	}

	private boolean existeEnRango(int piso, int espacio) {
		return (piso >= 0 && piso < CANT_PISOS) && (espacio >= 0 && espacio < CANT_ESPACIOS);
	}

	private Auto buscarEnLaFila(Auto[] filaDeAutos) {
		Auto masMoroso = null;
		Auto actual;

		for (int j = 0; j < CANT_ESPACIOS; j++) {
			actual = filaDeAutos[j];
			if (actual != null) {
				if (masMoroso == null || actual.cantidadDeDeudas() >= masMoroso.cantidadDeDeudas()) {
					masMoroso = actual;
				}
			}
		}
		return masMoroso;
	}

	private Auto buscarAuto(int piso, int espacio) {
		Auto autoEncontrado = null;
		Auto auto;

		auto = this.autos[piso][espacio];
		if (auto != null) {
			autoEncontrado = auto;
		}
		return autoEncontrado;
	}

	private Auto[] autosMasMorososPorPiso() {
		Auto[] autosMorosos = new Auto[CANT_PISOS];

		for (int i = 0; i < CANT_PISOS; i++) {
			autosMorosos[i] = this.buscarEnLaFila(this.autos[i]);
		}
		return autosMorosos;
	}

}
