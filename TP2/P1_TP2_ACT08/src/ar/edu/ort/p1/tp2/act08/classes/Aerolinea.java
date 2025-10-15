package ar.edu.ort.p1.tp2.act08.classes;

import java.util.ArrayList;
import java.util.List;

public class Aerolinea {

	private List<Reserva> reservas;
	private Avion avion;

	public Aerolinea(Avion avion) {
		this.reservas = new ArrayList<Reserva>();
		this.avion = avion;
	}

	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}

	public void asignar() {
		Asiento asiento;

		for (Reserva reserva : this.reservas) {
			asiento = this.avion.buscarAsiento(reserva.getNumAsiento());
			if (asiento != null) {
				asiento.asignarReservado();
			} else {
				System.out.println("En la reserva: " + reserva.getId() + " no se encontro el asiento");
			}
		}
	}

}
