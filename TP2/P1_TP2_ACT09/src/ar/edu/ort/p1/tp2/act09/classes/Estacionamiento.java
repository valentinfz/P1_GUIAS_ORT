package ar.edu.ort.p1.tp2.act09.classes;

public class Estacionamiento {

	private static final int CANT_ESPACIOS = 6;
	private static final int CANT_PISOS = 8;

	private Auto[][] autos;

	public Estacionamiento() {
		this.autos = new Auto[CANT_PISOS][CANT_ESPACIOS];
	}

	public Auto retirar(int posicion) { // Ej: posicion = 43
		int piso = posicion / 10; // da 4
		int espacio = posicion % 10; // da 3
		Auto auto = null;

		if (this.existeEnRango(piso, espacio)) {
			auto = this.buscarAuto(piso, espacio);
			if (auto != null) {
				if (auto.estaAlDia()) {
					this.remover(piso, espacio);
				} else {
					System.out.println("El auto no esta al dia");
				}
			} else {
				System.out.println("El auto es null");
			}
		} else {
			System.out.println("Rango no valido");
		}
		return auto;
	}

	public Auto[] autosMasMorososPorPiso() {
		Auto[] autosMorosos = new Auto[CANT_PISOS];

		for (int i = 0; i < CANT_PISOS; i++) {
			autosMorosos[i] = this.buscarEnLaFila(this.autos[i]);
		}
		return autosMorosos;
	}

	private void remover(int espacio, int piso) {
		this.autos[espacio][piso] = null;
	}

	private boolean existeEnRango(int espacio, int piso) {
		return (piso >= 0 && piso <= CANT_PISOS) && (espacio >= 0 && espacio <= CANT_ESPACIOS);
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

}
