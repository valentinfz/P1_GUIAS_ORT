package ar.edu.ort.p1.tp1.act02yact05.classes;

public class MultimediaVideo extends ArchivoMultimedia {

	private int alto;
	private int ancho;

	public MultimediaVideo(String nombre, double peso, String localizacion, int duracion, int alto, int ancho) {
		super(nombre, peso, localizacion, duracion);
		this.alto = alto;
		this.ancho = ancho;
	}

	public boolean esFullHD() {
		return this.ancho == 1920 && this.alto == 1080;
	}

	@Override
	public String toString() {
		return super.toString() + " - Resolución: " + alto + "x" + ancho;
	}

}
