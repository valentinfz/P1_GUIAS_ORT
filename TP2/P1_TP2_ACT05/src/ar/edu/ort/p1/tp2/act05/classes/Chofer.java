package ar.edu.ort.p1.tp2.act05.classes;

public class Chofer {

	private String id;
	private String nombre;
	private double pagoPorViaje;

	public Chofer(String id, String nombre, double pagoPorViaje) {
		this.id = id;
		this.nombre = nombre;
		this.pagoPorViaje = pagoPorViaje;
	}

	public boolean mismoChofer(String id) {
		return this.id.equals(id);
	}

	public double getPagoPorViaje() {
		return pagoPorViaje;
	}

	@Override
	public String toString() {
		return "Chofer [id=" + id + ", nombre=" + nombre + ", pagoPorViaje=" + pagoPorViaje + "]";
	}

}
