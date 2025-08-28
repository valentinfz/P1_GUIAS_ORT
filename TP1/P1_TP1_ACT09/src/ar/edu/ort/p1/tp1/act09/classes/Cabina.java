package ar.edu.ort.p1.tp1.act09.classes;

import java.util.ArrayList;
import java.util.List;

public class Cabina {

	private static final int HORA_PICO_MANIANA_A = 6;
	private static final int HORA_PICO_MANIANA_B = 10;
	private static final int HORA_PICO_TARDE_A = 17;
	private static final int HORA_PICO_TARDE_B = 20;

	private int numId;
	private MedioDePago medioDePago;
	private List<Vehiculo> vehiculos;

	public Cabina(int numId, MedioDePago medioDePago) {
		this.numId = numId;
		this.medioDePago = medioDePago;
		this.vehiculos = new ArrayList<Vehiculo>();
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void agregarVehiculos(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}

	public double cobrar(Vehiculo vehiculo) {
		double tarifaBase = vehiculo.getCategoria().getTarifaBase();
		double tarifaConRecargo;
		double tarifaFinal;

		tarifaConRecargo = aplicarRecargoHoraPico(tarifaBase);
		tarifaFinal = aplicarDescuento(tarifaConRecargo);

		return tarifaFinal;
	}

	@Override
	public String toString() {
		return "Cabina [numId=" + numId + ", medioDePago=" + medioDePago + "]";
	}

	private boolean estaEnHoraPico() {
		int hora = Estacion.dameHoraActual();

		return (hora >= HORA_PICO_MANIANA_A && hora <= HORA_PICO_MANIANA_B)
				|| (hora >= HORA_PICO_TARDE_A && hora <= HORA_PICO_TARDE_B);
	}

	private double aplicarRecargoHoraPico(double tarifaBase) {
		if (this.estaEnHoraPico()) {
			return tarifaBase * 1.08; // +8%
		} else {
			return tarifaBase;
		}
	}

	private double aplicarDescuento(double tarifa) {
		int descuento = this.medioDePago.fijarDescuento(); // por ejemplo: 10
		double porcentaje = 1 - (descuento / 100.0); // por ejemplo: 0.90

		return tarifa * porcentaje;
	}

}
