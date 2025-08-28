package ar.edu.ort.p1.tp1.act02yact05.domain;

import ar.edu.ort.p1.tp1.act02yact05.classes.Archivo;
import ar.edu.ort.p1.tp1.act02yact05.classes.ArchivoTexto;
import ar.edu.ort.p1.tp1.act02yact05.classes.MultimediaAudio;
import ar.edu.ort.p1.tp1.act02yact05.classes.MultimediaVideo;
import ar.edu.ort.p1.tp1.act02yact05.enums.FormatoAudio;

public class MainAct02 {

	public static void main(String[] args) {
		// Archivo genérico
		Archivo archivo = new Archivo("General.txt", 1.5, "C:/archivos");
		archivo.abrir();
		archivo.cambiarLocalizacion("D:/backup");
		archivo.cerrar();
		System.out.println("¿Archivo general abierto? " + archivo.getEstaAbierto());
		System.out.println();

		// Archivo de texto
		ArchivoTexto texto = new ArchivoTexto("Notas.txt", 0.8, "C:/documentos", "UTF-8");
		texto.abrir();
		texto.cifrar();
		texto.cerrar();
		System.out.println("¿Archivo de texto abierto? " + texto.getEstaAbierto());
		System.out.println();

		// Multimedia Audio
		MultimediaAudio audio = new MultimediaAudio("Cancion.mp3", 3.2, "C:/musica", 180, "Soda Stereo", "Signos",
				FormatoAudio.MP3);
		audio.abrir();
		audio.reproducir();
		audio.parar();
		audio.cerrar();
		System.out.println("¿Audio abierto? " + audio.getEstaAbierto());
		System.out.println();

		// Multimedia Video
		MultimediaVideo video = new MultimediaVideo("Video.mkv", 700, "C:/videos", 300, 1080, 1920);
		video.abrir();
		video.reproducir();
		video.parar();
		video.cerrar();
		System.out.println("¿Video abierto? " + video.getEstaAbierto());
		System.out.println();
	}
}
