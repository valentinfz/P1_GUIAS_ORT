package ar.edu.ort.p1.tp1.act15.classes;

import ar.edu.ort.p1.tp1.act15.interfaces.Interesado;

public class Cliente implements Interesado {

	private String apellido;
	private String nombre;
	private String telefono;
	private String email;

	public Cliente(String apellido, String nombre, String telefono, String email) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	@Override
	public String notificar(String mensaje) {
		return "He recibido un SMS en mi teléfono " + this.telefono + " con el mensaje: " + mensaje;
	}

}
