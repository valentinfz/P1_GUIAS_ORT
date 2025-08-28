package ar.edu.ort.p1.tp1.act09.enums;

public enum Categoria {
	AUTO(1000), MOTO(700), CAMION(1500); // valores de ejemplo

	private int tarifaBase;

	private Categoria(int tarifaBase) {
		this.tarifaBase = tarifaBase;
	}

	public int getTarifaBase() {
		return tarifaBase;
	}
}
