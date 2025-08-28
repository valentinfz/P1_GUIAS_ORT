package ar.edu.ort.p1.tp1.act02yact05.domain;

import ar.edu.ort.p1.tp1.act02yact05.classes.ArchivoTexto;
import ar.edu.ort.p1.tp1.act02yact05.classes.GestorDeArchivos;
import ar.edu.ort.p1.tp1.act02yact05.classes.MultimediaAudio;
import ar.edu.ort.p1.tp1.act02yact05.classes.MultimediaVideo;
import ar.edu.ort.p1.tp1.act02yact05.enums.FormatoAudio;

public class MainAct05 {

	public static void main(String[] args) {

		// Crear gestor
		GestorDeArchivos gestor = new GestorDeArchivos();

		// Crear y agregar archivos
		ArchivoTexto txt1 = new ArchivoTexto("notas.txt", 0.5, "C:/docs", "UTF-8");
		ArchivoTexto txt2 = new ArchivoTexto("proyecto.txt", 0.7, "C:/docs", "ISO-8859");

		MultimediaAudio audio1 = new MultimediaAudio("cancion.mp3", 3.0, "C:/musica", 180, "Soda Stereo", "Signos",
				FormatoAudio.MP3);

		MultimediaVideo video1 = new MultimediaVideo("pelicula.mkv", 1500, "C:/videos", 7200, 1080, 1920); // Full HD
		MultimediaVideo video2 = new MultimediaVideo("video720.mp4", 700, "C:/videos", 3000, 720, 1280); // No Full HD

		gestor.agregarArchivo(txt1);
		gestor.agregarArchivo(txt2);
		gestor.agregarArchivo(audio1);
		gestor.agregarArchivo(video1);
		gestor.agregarArchivo(video2);

		// Abrimos algunos archivos para probar cerrarTodos
		txt1.abrir();
		audio1.abrir();
		video1.abrir();

		// Probar cerrarTodos()
		System.out.println("\n--- Cerrando todos los archivos abiertos ---");
		gestor.cerrarTodos();

		// Probar cantArchivosDeTexto()
		System.out.println("\nCantidad de archivos de texto: " + gestor.cantArchivosDeTexto());

		// Probar cifrar archivos de texto
		System.out.println("\n--- Cifrando archivos de texto ---");
		gestor.cifrarArchivos("UTF-8");

		// Probar videosFullHD()
		System.out.println("\n--- Mostrando videos Full HD ---");
		gestor.mostrarVideosFullHD();
	}
}
