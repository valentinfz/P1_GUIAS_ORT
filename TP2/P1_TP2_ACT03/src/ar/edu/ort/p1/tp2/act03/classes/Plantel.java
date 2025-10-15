package ar.edu.ort.p1.tp2.act03.classes;

import ar.edu.ort.p1.tp2.act03.enums.TipoPosicion;

public class Plantel {

	private static final int CANT_JUGADORES = 23;

	private Jugador[] jugadores;

	public Plantel() {
		super();
		this.jugadores = new Jugador[CANT_JUGADORES];
	}

	public void agregarJugador(Jugador jugador) {
		boolean jugadorColocado = false;
		int i = 0;

		while (i < this.jugadores.length && jugadorColocado == false) {
			if (this.jugadores[i] == null) {
				this.jugadores[i] = jugador;
				jugadorColocado = true;
			} else {
				i++;
			}
		}
		if (jugadorColocado) {
			System.out.println("Jugador: " + jugador + " colocado correctamente");
		} else {
			System.out.println("No hay mas espacio disponible");
		}
	}

	public void cambio(int numJugador1, int numJugador2) {
		int indiceJugador1;
		int indiceJugador2;
		Jugador auxiliar;

		if (numJugador1 != numJugador2) {
			indiceJugador1 = this.buscarIndiceJugadorXNumero(numJugador1);
			indiceJugador2 = this.buscarIndiceJugadorXNumero(numJugador2);

			if (indiceJugador1 != -1 && indiceJugador2 != -1) {
				auxiliar = this.jugadores[indiceJugador1];
				this.jugadores[indiceJugador1] = this.jugadores[indiceJugador2];
				this.jugadores[indiceJugador2] = auxiliar;
				System.out.println("Cambio realizado entre camiseta " + numJugador1 + " y " + numJugador2);

			} else {
				System.out.println("Alguno de los jugadores no esta en el plantel");
			}
		} else {
			System.out.println("Los numeros de ambos jugadores son iguales");
		}
	}

	public void cambioPorLesion(int numJugadorLesionado, String apellidoReemplazante) {
		int indiceJugadorLesionado = this.buscarIndiceJugadorXNumero(numJugadorLesionado);
		Jugador lesionado;
		Jugador reemplazante;

		if (indiceJugadorLesionado != -1) {
			lesionado = this.jugadores[indiceJugadorLesionado];
			reemplazante = this.crearJugadorReemplazante(apellidoReemplazante, lesionado.getNumero(),
					lesionado.getTipoPosicion());

			this.jugadores[indiceJugadorLesionado] = reemplazante;

			System.out.println("Jugador lesionado: " + lesionado.getApellido() + " fue reemplazado por: "
					+ reemplazante.getApellido());
		} else {
			System.out.println("El numero de jugador: " + numJugadorLesionado + " no esta en el plantel");
		}
	}

	public void mostrarReservas() {
		for (Jugador jugador : this.obtenerReservas()) {
			System.out.println(jugador);
		}
	}

	public void mostrarCantJugadoresPorPosicion() {
		int[] cantidadPorPosicion = this.cantJugadoresPorPosicion();

		for (int i = 0; i < TipoPosicion.values().length; i++) {
			System.out.println(TipoPosicion.values()[i] + ": " + cantidadPorPosicion[i]);
		}
	}

	private int buscarIndiceJugadorXNumero(int numero) {
		int indice = -1;

		for (int i = 0; i < this.jugadores.length; i++) {
			if (this.jugadores[i].mismoNumero(numero)) {
				indice = i;
			}
		}
		if (this.jugadores.length < 0) {
			System.out.println("No hay jugadores en el plantel");
		}
		return indice;
	}

	private Jugador crearJugadorReemplazante(String apellido, int numero, TipoPosicion tipoPosicion) {
		return new Jugador(apellido, numero, tipoPosicion);
	}

	private int[] cantJugadoresPorPosicion() {
		int[] arrayCantidadPorPosicion = new int[TipoPosicion.values().length];

		for (Jugador jugador : this.jugadores) {
			int indice = jugador.getTipoPosicion().ordinal();
			arrayCantidadPorPosicion[indice]++;
		}
		return arrayCantidadPorPosicion;

	}

	private Jugador[] obtenerReservas() {
		int reservasApartirDePos = 18;
		int cantidadReservas = this.jugadores.length - reservasApartirDePos;
		int indiceDeArrayReserva = 0;
		Jugador[] arrayDeReservas = new Jugador[cantidadReservas];

		for (int i = reservasApartirDePos; i < this.jugadores.length; i++) {
			arrayDeReservas[indiceDeArrayReserva] = this.jugadores[i];
			indiceDeArrayReserva++;
		}
		return arrayDeReservas;
	}

}
