package ar.edu.ort.p1.tp1.act09.classes;

public class PagoDigitalPase extends MedioDePagoDigital {

	private static final int MAX_DEMORA = 5;

	public PagoDigitalPase(String descripcion, int diasDemora) {
		super(descripcion, diasDemora);
	}

	@Override
	public int fijarDescuento() {
		int descuentoFinal;

		if (this.hayDemora()) {
			descuentoFinal = 15;
		} else {
			descuentoFinal = 12;
		}
		return descuentoFinal;
	}

	@Override
	public String toString() {
		return super.toString() + " []";
	}

	private boolean hayDemora() {
		return this.getDiasDemora() > PagoDigitalPase.MAX_DEMORA;
	}

}
