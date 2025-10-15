package ar.edu.ort.p1.tp2.act03.domain;

import ar.edu.ort.p1.tp2.act03.classes.Jugador;
import ar.edu.ort.p1.tp2.act03.classes.Plantel;
import ar.edu.ort.p1.tp2.act03.enums.TipoPosicion;

public class Main {
	public static void main(String[] args) {
		Plantel seleccion = new Plantel();

		// Arqueros
		seleccion.agregarJugador(new Jugador("Martínez", 23, TipoPosicion.ARQUERO));
		seleccion.agregarJugador(new Jugador("Armani", 1, TipoPosicion.ARQUERO));
		seleccion.agregarJugador(new Jugador("Rulli", 12, TipoPosicion.ARQUERO));

		// Defensores
		seleccion.agregarJugador(new Jugador("Molina", 26, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("Montiel", 4, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("Tagliafico", 3, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("Acuña", 8, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("Otamendi", 19, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("Romero", 13, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("Pezzella", 6, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("LisandroMartínez", 25, TipoPosicion.DEFENSOR));
		seleccion.agregarJugador(new Jugador("Foyth", 2, TipoPosicion.DEFENSOR));

		// Mediocampistas
		seleccion.agregarJugador(new Jugador("DePaul", 7, TipoPosicion.MEDIOCAMPISTA));
		seleccion.agregarJugador(new Jugador("Paredes", 5, TipoPosicion.MEDIOCAMPISTA));
		seleccion.agregarJugador(new Jugador("LoCelso", 20, TipoPosicion.MEDIOCAMPISTA));
		seleccion.agregarJugador(new Jugador("GuidoRodríguez", 18, TipoPosicion.MEDIOCAMPISTA));
		seleccion.agregarJugador(new Jugador("EnzoFernández", 24, TipoPosicion.MEDIOCAMPISTA));
		seleccion.agregarJugador(new Jugador("MacAllister", 15, TipoPosicion.MEDIOCAMPISTA));
		seleccion.agregarJugador(new Jugador("Palacios", 14, TipoPosicion.MEDIOCAMPISTA));

		// Delanteros
		seleccion.agregarJugador(new Jugador("Messi", 10, TipoPosicion.DELANTERO));
		seleccion.agregarJugador(new Jugador("DiMaría", 11, TipoPosicion.DELANTERO));
		seleccion.agregarJugador(new Jugador("JuliánÁlvarez", 9, TipoPosicion.DELANTERO));
		seleccion.agregarJugador(new Jugador("LautaroMartínez", 22, TipoPosicion.DELANTERO));

		System.out.println("\n=== Cantidad de jugadores por posición ===");
		seleccion.mostrarCantJugadoresPorPosicion();

		System.out.println("\n=== Prueba de cambio de camisetas ===");
		seleccion.cambio(10, 9); // Messi <-> Julián

		System.out.println("\n=== Prueba de cambio por lesión ===");
		seleccion.cambioPorLesion(20, "Papu Gómez");

		System.out.println("\n=== Mostrar reservas (últimos 5 en el array de 23) ===");
		seleccion.mostrarReservas();
	}
}
