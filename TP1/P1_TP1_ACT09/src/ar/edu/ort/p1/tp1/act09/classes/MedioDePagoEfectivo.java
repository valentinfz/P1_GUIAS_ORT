package ar.edu.ort.p1.tp1.act09.classes;

public class MedioDePagoEfectivo extends MedioDePago {

	public MedioDePagoEfectivo(String descripcion) {
		super(descripcion);
	}

	@Override
	public int fijarDescuento() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + " []";
	}

}
