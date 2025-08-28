package ar.edu.ort.p1.tp1.act02yact05.classes;

public class ArchivoTexto extends Archivo {

	private String codificacion;
	private boolean estaCifrado;

	public ArchivoTexto(String nombre, double peso, String localizacion, String codificacion) {
		super(nombre, peso, localizacion);
		this.codificacion = codificacion;
		this.estaCifrado = false;
	}

	public void cifrar() {
		this.estaCifrado = true;
		System.out.println("El archivo fue cifrado");
	}

	public boolean mismoCifrado(String cifrado) {
		return this.codificacion.equals(cifrado);
	}

}
