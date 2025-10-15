package ar.edu.ort.p1.tp2.act02.domain;

import ar.edu.ort.p1.tp2.act02.classes.Baraja;
import ar.edu.ort.p1.tp2.act02.classes.Carta;
import ar.edu.ort.p1.tp2.act02.enums.Palo;

public class Main {

	public static void main(String[] args) {

		// === Baraja ORDENADA ===
		Baraja barajaOrdenada = new Baraja();

		for (Palo palo : Palo.values()) {
			for (int i = 1; i <= 10; i++) {
				barajaOrdenada.agregarCarta(new Carta(palo, i));
			}
		}

		System.out.println("\n¿Baraja ordenada?: " + barajaOrdenada.estaOrdenada()); // ✅ true

		System.out.println();

		// === Baraja DESORDENADA ===
		Baraja barajaDesordenada = new Baraja();

		// Cargamos algunas cartas desordenadas
		barajaDesordenada.agregarCarta(new Carta(Palo.COPAS, 5));
		barajaDesordenada.agregarCarta(new Carta(Palo.OROS, 3));
		barajaDesordenada.agregarCarta(new Carta(Palo.ESPADAS, 2));
		barajaDesordenada.agregarCarta(new Carta(Palo.ESPADAS, 1));

		System.out.println("\n¿Baraja ordenada?: " + barajaDesordenada.estaOrdenada()); // ❌ false
	}
}
