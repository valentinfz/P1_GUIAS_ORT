package ar.edu.ort.p1.tp1.act09.classes;

public abstract class MedioDePago {

	private String descripcion;

	public MedioDePago(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "MedioDePago [descripcion=" + descripcion + "]";
	}

	public abstract int fijarDescuento();

}
