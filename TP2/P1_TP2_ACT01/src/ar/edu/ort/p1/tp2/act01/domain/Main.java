package ar.edu.ort.p1.tp2.act01.domain;

import ar.edu.ort.p1.tp2.act01.classes.Cajero;
import ar.edu.ort.p1.tp2.act01.classes.Restaurant;

public class Main {

	public static void main(String[] args) {

		Restaurant r = new Restaurant();
		Cajero c = new Cajero();

		r.cantidadDeCajeros();

		r.agregarCajero(c);
		r.agregarCajero(c);
		r.agregarCajero(c);
		r.agregarCajero(c);
		r.agregarCajero(c);

		r.cantidadDeCajeros();

	}

}
