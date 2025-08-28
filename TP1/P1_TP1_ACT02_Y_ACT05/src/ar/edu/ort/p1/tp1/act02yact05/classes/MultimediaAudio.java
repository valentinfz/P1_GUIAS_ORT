package ar.edu.ort.p1.tp1.act02yact05.classes;

import ar.edu.ort.p1.tp1.act02yact05.enums.FormatoAudio;

public class MultimediaAudio extends ArchivoMultimedia {

	private String artista;
	private String album;
	private FormatoAudio formato;

	public MultimediaAudio(String nombre, double peso, String localizacion, int duracion, String artista, String album,
			FormatoAudio formato) {
		super(nombre, peso, localizacion, duracion);
		this.artista = artista;
		this.album = album;
		this.formato = formato;
	}

}
