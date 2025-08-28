package ar.edu.ort.p1.tp1.act09.classes;

public class PagoDigitalSube extends MedioDePagoDigital {

	public PagoDigitalSube(String descripcion, int diasDemora) {
		super(descripcion, diasDemora);
	}

	@Override
	public int fijarDescuento() {
		return 10;
	}

	@Override
	public String toString() {
		return super.toString() + " []";
	}

}
