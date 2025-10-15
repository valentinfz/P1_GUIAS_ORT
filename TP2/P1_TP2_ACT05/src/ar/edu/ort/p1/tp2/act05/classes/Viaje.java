package ar.edu.ort.p1.tp2.act05.classes;

public class Viaje {

	private int idCamion; // 0..9
	private String idChofer;
	private double kmDelViaje;

	public Viaje(int idCamion, String idChofer, double kmDelViaje) {
		super();
		this.idCamion = idCamion;
		this.idChofer = idChofer;
		this.kmDelViaje = kmDelViaje;
	}

	public int getIdCamion() {
		return idCamion;
	}

	public String getIdChofer() {
		return idChofer;
	}

	public double calcularCosto(double precioPorKm) {
		return this.kmDelViaje * precioPorKm;
	}

	@Override
	public String toString() {
		return "Viaje [idCamion=" + idCamion + ", idChofer=" + idChofer + ", kmDelViaje=" + kmDelViaje + "]";
	}

}
