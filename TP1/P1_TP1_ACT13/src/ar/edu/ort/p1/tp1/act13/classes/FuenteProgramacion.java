package ar.edu.ort.p1.tp1.act13.classes;

import java.util.ArrayList;
import java.util.List;

public class FuenteProgramacion extends Fuente {

	private List<Metodo> metodos;

	public FuenteProgramacion(String nombre, String ruta) {
		super(nombre, ruta);
		this.metodos = new ArrayList<Metodo>();
	}

	public void agregarMetodo(Metodo metodo) {
		this.metodos.add(metodo);
	}

	@Override
	public double calcularIndiceCalidad() {
		double cantidad = 0;
		double acumulador = 0;

		for (Metodo metodo : this.metodos) {
			acumulador += metodo.promedioIndiceCalidad();
			cantidad++;
		}
		return acumulador / cantidad;
	}

	@Override
	public Metodo buscarMetodo(String nombre) {
		Metodo metodoEncontrado = null;
		Metodo metodo;
		int i = 0;

		while (i < this.metodos.size() && metodoEncontrado == null) {
			metodo = this.metodos.get(i);
			if (metodo.mismoNombre(nombre)) {
				metodoEncontrado = metodo;
			} else {
				i++;
			}
		}
		return metodoEncontrado;
	}

	@Override
	public String toString() {
		return super.toString() + "FuenteProgramacion [metodos=" + metodos + "]";
	}

}
