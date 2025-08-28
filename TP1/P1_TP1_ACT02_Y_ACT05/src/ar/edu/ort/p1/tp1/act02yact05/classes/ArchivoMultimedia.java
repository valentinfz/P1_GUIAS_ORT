package ar.edu.ort.p1.tp1.act02yact05.classes;

public class ArchivoMultimedia extends Archivo {

	private int duracion;
	private boolean estaReproduciendo;

	public ArchivoMultimedia(String nombre, double peso, String localizacion, int duracion) {
		super(nombre, peso, localizacion);
		this.duracion = duracion;
		this.estaReproduciendo = false;
	}

	public int getDuracion() {
		return duracion;
	}

	public void reproducir() {
		if (!this.estaReproduciendo && this.getEstaAbierto()) {
			this.estaReproduciendo = true;
			System.out.println("El archivo se esta reproduciendo");
		}
	}

	public void parar() {
		if (this.estaReproduciendo && this.getEstaAbierto()) {
			this.estaReproduciendo = false;
			System.out.println("El archivo no se esta reproduciendo");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " - Duración: " + duracion + " segs - Reproduciendo: " + estaReproduciendo;
	}

}
