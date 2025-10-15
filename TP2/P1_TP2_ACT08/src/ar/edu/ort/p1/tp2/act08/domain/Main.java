package ar.edu.ort.p1.tp2.act08.domain;

import ar.edu.ort.p1.tp2.act08.classes.Aerolinea;
import ar.edu.ort.p1.tp2.act08.classes.Avion;
import ar.edu.ort.p1.tp2.act08.classes.Reserva;

public class Main {

	public static void main(String[] args) {
		// Crear avión e inicializar asientos
		Avion avion = new Avion("Boeing 737");

		// Crear aerolínea con ese avión
		Aerolinea aerolinea = new Aerolinea(avion);

		// Crear algunas reservas válidas
		Reserva r1 = new Reserva("R001", 12345678, 1);
		Reserva r2 = new Reserva("R002", 87654321, 10);
		Reserva r3 = new Reserva("R003", 56781234, 96);

		// Agregar las reservas a la aerolínea
		aerolinea.agregarReserva(r1);
		aerolinea.agregarReserva(r2);
		aerolinea.agregarReserva(r3);

		// Mostrar el mapa de asientos antes de asignar reservas
		System.out.println("=== Antes de asignar reservas ===");
		avion.mostrarAsientos();

		// Asignar las reservas (marca los asientos como RESERVADOS)
		aerolinea.asignar();

		// Mostrar el mapa de asientos después de asignar
		System.out.println("\n=== Después de asignar reservas ===");
		avion.mostrarAsientos();
	}
}
