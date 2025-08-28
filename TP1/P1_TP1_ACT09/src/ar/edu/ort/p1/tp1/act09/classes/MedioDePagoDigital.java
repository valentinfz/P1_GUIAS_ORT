package ar.edu.ort.p1.tp1.act09.classes;

public abstract class MedioDePagoDigital extends MedioDePago {

	private int diasDemora;

	public MedioDePagoDigital(String descripcion, int diasDemora) {
		super(descripcion);
		this.diasDemora = diasDemora;
	}

	public int getDiasDemora() {
		return diasDemora;
	}

	@Override
	public String toString() {
		return super.toString() + " [diasDemora=" + diasDemora + "]";
	}

}
