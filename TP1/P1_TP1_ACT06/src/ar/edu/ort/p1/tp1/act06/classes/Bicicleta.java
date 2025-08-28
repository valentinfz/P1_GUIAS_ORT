package ar.edu.ort.p1.tp1.act06.classes;

public class Bicicleta {

	private static final int KILOMETROS_MAXIMOS = 2000;

	private String marca;
	private String modelo;
	private int kilometros;

	public Bicicleta(String marca, String modelo, int kilometros) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
	}

	public boolean cumpleRequisitos() {
		return this.kilometros < Bicicleta.KILOMETROS_MAXIMOS;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", modelo=" + modelo + ", kilometros=" + kilometros + "]";
	}

}
