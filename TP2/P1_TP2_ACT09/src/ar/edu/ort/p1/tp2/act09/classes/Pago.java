package ar.edu.ort.p1.tp2.act09.classes;

public class Pago {

	private double monto;
	private String dni;

	public Pago(double monto, String dni) {
		this.monto = monto;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Pago [monto=" + monto + ", dni=" + dni + "]";
	}

}
