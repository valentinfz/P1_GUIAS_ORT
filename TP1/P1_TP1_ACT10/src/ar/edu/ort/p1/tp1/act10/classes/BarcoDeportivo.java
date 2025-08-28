package ar.edu.ort.p1.tp1.act10.classes;

public abstract class BarcoDeportivo extends Barco {

	private static final double INDICE_POTENCIA = 0.35;

	private int hpPotencia;
	private int aerodinamica;

	public BarcoDeportivo(String duenio, String matricula, double eslora, int anioDeFabricacion, int hpPotencia,
			int aerodinamica) {
		super(duenio, matricula, eslora, anioDeFabricacion);
		this.hpPotencia = hpPotencia;
		this.aerodinamica = aerodinamica;
	}

	public static double getIndicePotencia() {
		return INDICE_POTENCIA;
	}

	public int getHpPotencia() {
		return hpPotencia;
	}

	public int getAerodinamica() {
		return aerodinamica;
	}

	@Override
	public double calcularValorAdicional() {
		return Amarra.getValorAdicional() * this.obtenerMitadPotencia();
	}

	public double calcularConsumo() {
		return (this.getHpPotencia() / (double) this.getAerodinamica() / BarcoDeportivo.getIndicePotencia());
	}

	@Override
	public String toString() {
		return super.toString() + " [hpPotencia=" + hpPotencia + ", aerodinamica=" + aerodinamica + "]";
	}

	private int obtenerMitadPotencia() {
		return this.hpPotencia / 2;
	}

}
