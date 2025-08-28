package ar.edu.ort.p1.tp1.act10.classes;

public class DeportivoLujo extends BarcoDeportivo {

	public DeportivoLujo(String duenio, String matricula, double eslora, int anioDeFabricacion, int hpPotencia,
			int aerodinamica) {
		super(duenio, matricula, eslora, anioDeFabricacion, hpPotencia, aerodinamica);
	}

	@Override
	public double calcularConsumo() {
		return 2 * this.getHpPotencia() * BarcoDeportivo.getIndicePotencia();
	}

	@Override
	public String toString() {
		return super.toString() + " []";
	}

}
