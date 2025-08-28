package ar.edu.ort.p1.tp1.act10.classes;

public class DeportivoComun extends BarcoDeportivo {

	public DeportivoComun(String duenio, String matricula, double eslora, int anioDeFabricacion, int hpPotencia,
			int aerodinamica) {
		super(duenio, matricula, eslora, anioDeFabricacion, hpPotencia, aerodinamica);
	}

	@Override
	public String toString() {
		return super.toString() + " []";
	}

}
