package ar.edu.ort.p1.tp2.act05.classes;

public class Camion {

	private int id; // 0..9
	private double costoPorKm;

	public Camion(int id, double costoPorKm) {
		this.id = id;
		this.costoPorKm = costoPorKm;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	@Override
	public String toString() {
		return "Camion [id=" + id + ", costoPorKm=" + costoPorKm + "]";
	}

}
