package ar.edu.ort.p1.tp1.act15.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act15.interfaces.Interesado;

public class Inmueble {

	private String domicilio;
	private double superficieM2;
	private int cantAmbientes;
	private double precio;
	private List<Interesado> interesados;

	public Inmueble(String domicilio, double superficieM2, int cantAmbientes, double precio) {
		this.domicilio = domicilio;
		this.superficieM2 = superficieM2;
		this.cantAmbientes = cantAmbientes;
		this.precio = precio;
		this.interesados = new ArrayList<Interesado>();
	}

	public void agregarInteresado(Interesado interesado) {
		this.interesados.add(interesado);
	}

	public void crearAviso(double nuevoPrecio) {
		double precioAnterior = this.precio;
		String mensaje;

		this.cambiarPrecio(nuevoPrecio);

		mensaje = "El inmueble " + this.toString() + " por el que ha demostrado interés cambió su precio de "
				+ precioAnterior + " a " + this.precio;

		this.notificarATodos(mensaje);
	}

	private void notificarATodos(String mensaje) {
		for (Interesado interesado : this.interesados) {
			System.out.println(interesado.notificar(mensaje));
		}
	}

	private void cambiarPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}

	@Override
	public String toString() {
		return "Inmueble [domicilio=" + domicilio + ", superficieM2=" + superficieM2 + ", cantAmbientes="
				+ cantAmbientes + ", precio=" + precio + ", interesados=" + interesados + "]";
	}

}
