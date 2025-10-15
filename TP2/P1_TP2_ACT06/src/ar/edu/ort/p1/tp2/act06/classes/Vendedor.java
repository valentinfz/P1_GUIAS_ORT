package ar.edu.ort.p1.tp2.act06.classes;

public class Vendedor {

	private String id;
	private String nombre;

	public Vendedor(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nombre=" + nombre + "]";
	}

}
