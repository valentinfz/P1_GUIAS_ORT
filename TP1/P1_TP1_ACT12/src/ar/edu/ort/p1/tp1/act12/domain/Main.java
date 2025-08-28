package ar.edu.ort.p1.tp1.act12.domain;

import ar.edu.ort.p1.tp1.act12.classes.*;
import ar.edu.ort.p1.tp1.act12.enums.TipoMotivo;

public class Main {

	public static void main(String[] args) {

		Centro centro = new Centro();

		// Día 1
		DiaTesteo dia1 = new DiaTesteo("30/07/2025", true);
		dia1.agregarPersona(new Persona("123", "Ana Gómez", 65, TipoMotivo.VIAJE)); // prioritaria por edad
		dia1.agregarPersona(new Persona("124", "Carlos Díaz", 50, TipoMotivo.CONTACTO_ESTRECHO)); // prioritaria por motivo
		dia1.agregarPersona(new PersonaConObraSocial("125", "Laura Paz", 30, TipoMotivo.VIAJE, "OSDE", 111)); // no prioritaria
		dia1.agregarPersona(new Persona("126", "Pedro López", 61, TipoMotivo.REPETICION_POR_ERROR)); // prioritaria por edad
		dia1.agregarPersona(new Persona("127", "Marta Ruiz", 59, TipoMotivo.REPETICION_POR_ERROR)); // no prioritaria
		dia1.agregarPersona(new Persona("128", "Lucía Martínez", 40, TipoMotivo.VIAJE)); // fuera de cupos
		
		// Día 2
		DiaTesteo dia2 = new DiaTesteo("31/07/2025", false);
		dia2.agregarPersona(new Persona("130", "Rodolfo Acuña", 61, TipoMotivo.CONTACTO_ESTRECHO)); // prioritaria por ambos
		dia2.agregarPersona(new Persona("131", "Julieta Neme", 25, TipoMotivo.CONTACTO_ESTRECHO)); // prioritaria
		dia2.agregarPersona(new PersonaConObraSocial("132", "Cecilia Gallo", 62, TipoMotivo.VIAJE, "Swiss Medical", 222)); // prioritaria por edad
		dia2.agregarPersona(new Persona("133", "Emilia Funes", 22, TipoMotivo.VIAJE)); // no prioritaria
		dia2.agregarPersona(new Persona("134", "Tomas Blanco", 30, TipoMotivo.VIAJE)); // no prioritaria

		// Agrego los días al centro
		centro.agregarDiaTesteo(dia1);
		centro.agregarDiaTesteo(dia2);

		// Revisar días y notificar si hay personas fuera de cupo
		double porcentajeFuera = centro.revisar("No hay cupos para hoy");
		System.out.println("Porcentaje de personas fuera del cupo: " + porcentajeFuera + "%");

		// Mostrar el día con más personas prioritarias
		centro.mostrarDiaConMasPrioritarios();
	}
}
