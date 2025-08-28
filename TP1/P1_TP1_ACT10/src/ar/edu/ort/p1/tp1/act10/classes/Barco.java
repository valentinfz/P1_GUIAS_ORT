package ar.edu.ort.p1.tp1.act10.classes;

public abstract class Barco {

	private String duenio;
	private String matricula;
	private double eslora;
	private int anioDeFabricacion;

	public Barco(String duenio, String matricula, double eslora, int anioDeFabricacion) {
		this.duenio = duenio;
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioDeFabricacion = anioDeFabricacion;
	}

	public double calcularValorBase() {
		return Amarra.getValorInicial() * this.eslora;
	}

	public double calcularImporteFinal() {
		return this.calcularValorBase() + this.calcularValorAdicional();
	}

	@Override
	public String toString() {
		return "Barco [duenio=" + duenio + ", matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion="
				+ anioDeFabricacion + "]";
	}

	public abstract double calcularValorAdicional();

}
