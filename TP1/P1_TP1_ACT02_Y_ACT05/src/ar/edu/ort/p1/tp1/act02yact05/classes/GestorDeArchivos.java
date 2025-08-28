package ar.edu.ort.p1.tp1.act02yact05.classes;

import java.util.ArrayList;
import java.util.List;

public class GestorDeArchivos {

	private List<Archivo> archivos;

	public GestorDeArchivos() {
		this.archivos = new ArrayList<Archivo>();
	}

	public void agregarArchivo(Archivo archivo) {
		this.archivos.add(archivo);
		System.out.println("Se agrego el archivo " + archivo);
	}

	public void cerrarTodos() {
		for (Archivo archivo : this.archivos) {
			if (archivo.estaAbierto()) {
				archivo.cerrar();
			}
		}
	}

	public int cantArchivosDeTexto() {
		int cantidad = 0;

		for (Archivo archivo : this.archivos) {
			if (archivo instanceof ArchivoTexto) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public void cifrarArchivos(String cifrado) {
		ArchivoTexto archivoTexto;
		for (Archivo archivo : this.archivos) {
			if (archivo instanceof ArchivoTexto) {
				archivoTexto = (ArchivoTexto) archivo; // downcasting de Archivo a ArchivoTexto
				if (archivoTexto.mismoCifrado(cifrado)) {
					archivoTexto.cifrar();
				}
			}
		}
	}

	public int calcularDuracionPromedioDeMultimedia() {
		int total = 0;
		int cantidad = 0;
		int promedio = 0;
		ArchivoMultimedia multimedia;

		for (Archivo archivo : this.archivos) {
			if (archivo instanceof ArchivoMultimedia) {
				multimedia = (ArchivoMultimedia) archivo;
				total += multimedia.getDuracion();
				cantidad++;
			}
		}
		if (cantidad > 0) {
			promedio = total / cantidad;
		}
		return promedio;
	}

	public void mostrarVideosFullHD() {
		ArrayList<MultimediaVideo> listaVideosFullHD = this.videosFullHD();

		for (MultimediaVideo multimediaVideo : listaVideosFullHD) {
			System.out.println(multimediaVideo);
		}
	}

	private ArrayList<MultimediaVideo> videosFullHD() {
		ArrayList<MultimediaVideo> listaVideosFullHD = new ArrayList<MultimediaVideo>();
		MultimediaVideo multimediaVideo;

		for (Archivo archivo : this.archivos) {
			if (archivo instanceof MultimediaVideo) {
				multimediaVideo = (MultimediaVideo) archivo;
				if (multimediaVideo.esFullHD()) {
					listaVideosFullHD.add(multimediaVideo);
				}
			}
		}
		return listaVideosFullHD;
	}

}
