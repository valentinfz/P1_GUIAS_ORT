package ar.edu.ort.p1.tp1.act10.classes;

public class BarcoVelero extends Barco {

	private int cantMastiles;

	public BarcoVelero(String duenio, String matricula, double eslora, int anioDeFabricacion, int cantMastiles) {
		super(duenio, matricula, eslora, anioDeFabricacion);
		this.cantMastiles = cantMastiles;
	}

	@Override
	public double calcularValorAdicional() {
		return Amarra.getValorAdicional() * this.cantMastiles;
	}

	@Override
	public String toString() {
		return super.toString() + " [cantMastiles=" + cantMastiles + "]";
	}

}
