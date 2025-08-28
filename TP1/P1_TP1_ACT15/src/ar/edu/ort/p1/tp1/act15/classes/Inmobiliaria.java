package ar.edu.ort.p1.tp1.act15.classes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.tp1.act15.interfaces.Interesado;

public class Inmobiliaria implements Interesado {

	private String nombre;
	private String email;
	private double porcentajeComision;
	private List<Inmueble> inmuebles;

	public Inmobiliaria(String nombre, String email, double porcentajeComision) {
		this.nombre = nombre;
		this.email = email;
		this.porcentajeComision = porcentajeComision;
		this.inmuebles = new ArrayList<Inmueble>();
	}

	@Override
	public String notificar(String mensaje) {
		return "Hemos recibido un mail a nuestra casilla " + this.email + " con el mensaje: " + mensaje;
	}

}
