package ar.edu.ort.p1.tp1.act15.domain;

import ar.edu.ort.p1.tp1.act15.classes.Cliente;
import ar.edu.ort.p1.tp1.act15.classes.Inmobiliaria;
import ar.edu.ort.p1.tp1.act15.classes.Inmueble;

public class Main {

	public static void main(String[] args) {

		// 1. Crear clientes
		Cliente cliente1 = new Cliente("García", "Juan", "1122334455", "juan@mail.com");
		Cliente cliente2 = new Cliente("López", "María", "1199887766", "maria@mail.com");

		// 2. Crear inmobiliarias
		Inmobiliaria inmo1 = new Inmobiliaria("InmoCentro", "contacto@inmocentro.com", 0.03);
		Inmobiliaria inmo2 = new Inmobiliaria("TuCasa", "info@tucasa.com", 0.025);

		// 3. Crear inmuebles
		Inmueble depto1 = new Inmueble("Av. Siempre Viva 742", 80.5, 3, 100000);
		Inmueble depto2 = new Inmueble("Calle Falsa 123", 55.0, 2, 75000);

		// 4. Agregar interesados
		// Agregamos clientes como interesados
		depto1.agregarInteresado(cliente1);
		depto1.agregarInteresado(inmo1);

		depto2.agregarInteresado(cliente2);
		depto2.agregarInteresado(inmo2);

		// 5. Cambiar precio y notificar
		System.out.println("=== Cambio de precio en depto1 ===");
		depto1.crearAviso(95000);

		System.out.println("\n=== Cambio de precio en depto2 ===");
		depto2.crearAviso(70000);
	}
}
