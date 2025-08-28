package ar.edu.ort.p1.tp1.act11.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act11.interfaces.Facturable;

public class Comercio {

	private List<Facturable> historialVendido;

	public Comercio() {
		super();
		this.historialVendido = new ArrayList<Facturable>();
	}

	public void agregarItemFacturable(Facturable item) {
		this.historialVendido.add(item);
	}

	public double montoTotalFacturado() {
		double totalFacturado = 0;

		for (Facturable item : historialVendido) {
			totalFacturado += item.obtenerMontoDeFacturacion();
		}
		return totalFacturado;
	}

	public int cantServiciosSimples() {
		int cantSimples = 0;
		ServicioReparacion itemServicioReparacion;

		for (Facturable item : this.historialVendido) {
			if (item instanceof ServicioReparacion) {
				itemServicioReparacion = (ServicioReparacion) item;
				if (itemServicioReparacion.esReparacionSimple()) {
					cantSimples++;
				}
			}
		}
		return cantSimples;
	}
}
