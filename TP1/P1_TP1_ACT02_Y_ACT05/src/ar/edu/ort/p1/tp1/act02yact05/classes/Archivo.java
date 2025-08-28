package ar.edu.ort.p1.tp1.act02yact05.classes;

public class Archivo {

	private String nombre;
	private double peso;
	private String localizacion;
	private boolean estaAbierto;

	public Archivo(String nombre, double peso, String localizacion) {
		this.nombre = nombre;
		this.peso = peso;
		this.localizacion = localizacion;
		this.estaAbierto = false;
	}

	public boolean getEstaAbierto() {
		return estaAbierto;
	}

	public boolean estaAbierto() {
		return this.estaAbierto;
	}

	public void abrir() {
		if (!this.estaAbierto) {
			this.estaAbierto = true;
			System.out.println("El archivo se abrio");
		}
	}

	public void cerrar() {
		if (this.estaAbierto) {
			this.estaAbierto = false;
			System.out.println("El archivo se cerro");
		}
	}

	public void cambiarLocalizacion(String nuevaLocalizacion) {
		if (this.localizacion != null) {
			this.localizacion = nuevaLocalizacion;
		}
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Peso: " + peso + "MB - Ubicación: " + localizacion + " - Abierto: "
				+ estaAbierto;
	}

}
