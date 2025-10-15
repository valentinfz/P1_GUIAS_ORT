package ar.edu.ort.p1.tp2.act04.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp2.act04.enums.Estacion;
import ar.edu.ort.p1.tp2.act04.interfaces.Calculable;

public class Empresa implements Calculable {

	private List<Reserva> reservas;

	public Empresa() {
		this.reservas = new ArrayList<Reserva>();
	}

	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}

	// En el enunciado es: recaudacionTotal() pero lo dejo asi para usar Calculable
	@Override
	public double calcularPrecio() {
		double montoRecaudado = 0;

		for (Reserva reserva : this.reservas) {
			montoRecaudado += reserva.calcularPrecio();
		}
		return montoRecaudado;
	}

	public int cantVecesRecorrida(Estacion estacion) {
		int cantPersonas = 0;

		for (Reserva reserva : this.reservas) {
			if (reserva.getRecorrido().pasoPorLaEstacion(estacion)) {
				cantPersonas += reserva.getCantPersonas();
			}
		}
		return cantPersonas;
	}

}
