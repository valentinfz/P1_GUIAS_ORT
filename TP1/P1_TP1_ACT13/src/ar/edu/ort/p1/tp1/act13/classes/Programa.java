package ar.edu.ort.p1.tp1.act13.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act13.interfaces.Calificable;

public class Programa implements Calificable {

	private String id;
	private String nombre;
	private String nombreResponsable;
	private boolean pasoPruebas;
	private List<Fuente> fuentes;

	public Programa(String id, String nombre, String nombreResponsable, boolean pasoPruebas) {
		this.id = id;
		this.nombre = nombre;
		this.nombreResponsable = nombreResponsable;
		this.pasoPruebas = pasoPruebas;
		this.fuentes = new ArrayList<Fuente>();
	}

	public void agregarFuente(Fuente fuente) {
		this.fuentes.add(fuente);
	}

	public void mostrarDetalleDeMetodo(String nombre) {
		Metodo metodo = this.buscarMetodo(nombre);

		if (metodo != null) {
			metodo.mostrarDatosRelevantes();
		} else {
			System.out.println("El metodo no existe con el nombre ingresado");
		}
	}

	public void mostrarListadoFuentesMayoresAlPromedio() {
		List<Fuente> listadoDeFuentes = this.listadoFuentesMayoresAlPromedio();

		for (Fuente fuente : listadoDeFuentes) {
			System.out.println(fuente);
		}
	}

	public boolean estaPorDebajo(double umbral) {
		return this.calcularIndiceCalidad() < umbral;
	}

	@Override
	public double calcularIndiceCalidad() {
		double acumulador = 0;
		double cantidad = 0;
		double promedio;

		for (Fuente fuente : this.fuentes) {
			acumulador += fuente.calcularIndiceCalidad();
			cantidad++;
		}

		if (cantidad > 0) {
			promedio = acumulador / cantidad;
		} else {
			promedio = 0;
		}

		return promedio;
	}

	@Override
	public String toString() {
		return "Programa [id=" + id + ", nombre=" + nombre + ", nombreResponsable=" + nombreResponsable
				+ ", pasoPruebas=" + pasoPruebas + ", fuentes=" + fuentes + "]";
	}

	private List<Fuente> listadoFuentesMayoresAlPromedio() {
		List<Fuente> listadoDeFuentes = new ArrayList<Fuente>();
		double promedio = this.calcularIndiceCalidad();

		for (Fuente fuente : this.fuentes) {
			if (fuente.calcularIndiceCalidad() > promedio) {
				listadoDeFuentes.add(fuente);
			}
		}
		return listadoDeFuentes;
	}

	private Metodo buscarMetodo(String nombre) {
		Metodo metodo;
		Metodo metodoEncontrado = null;

		for (Fuente fuente : this.fuentes) {
			metodo = fuente.buscarMetodo(nombre);
			if (metodo != null) {
				metodoEncontrado = metodo;
			}
		}
		return metodoEncontrado;
	}
}
