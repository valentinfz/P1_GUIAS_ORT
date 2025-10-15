package ar.edu.ort.p1.tp2.act02.classes;

public class Baraja {
	private Carta[] cartas;

	private static final int CANT_CARTAS = 40;

	public Baraja() {
		this.cartas = new Carta[CANT_CARTAS];
	}

	public void agregarCarta(Carta carta) {
		boolean camionColocado = false;
		int i = 0;
		while (i < this.cartas.length && camionColocado == false) {
			if (this.cartas[i] == null) {
				this.cartas[i] = carta;
				camionColocado = true;
			} else {
				i++;
			}
		}
		if (camionColocado) {
			System.out.println(carta + " colocado correctamente");
		} else {
			System.out.println("No hay mas espacio disponible");
		}
	}

	public boolean estaOrdenada() {
		Carta actual;
		Carta siguiente;
		boolean resultado = true;

		for (int i = 0; i < cartas.length - 1; i++) {
			actual = cartas[i];
			siguiente = cartas[i + 1];

			if (actual != null && siguiente != null) {
				if ((actual.getPalo().ordinal() > siguiente.getPalo().ordinal()
						|| (actual.getPalo() == siguiente.getPalo()) && (actual.getNumero() > siguiente.getNumero()))) {
					resultado = false;
				}
			}
		}
		return resultado;
	}

}
