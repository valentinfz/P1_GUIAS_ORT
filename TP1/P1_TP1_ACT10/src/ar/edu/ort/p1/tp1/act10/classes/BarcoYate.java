package ar.edu.ort.p1.tp1.act10.classes;

public class BarcoYate extends Barco {

	private int cantCamarotes;

	public BarcoYate(String duenio, String matricula, double eslora, int anioDeFabricacion, int cantCamarotes) {
		super(duenio, matricula, eslora, anioDeFabricacion);
		this.cantCamarotes = cantCamarotes;
	}

	@Override
	public double calcularValorAdicional() {
		return Amarra.getValorAdicional() * this.cantCamarotes;
	}

	@Override
	public String toString() {
		return super.toString() + " [cantCamarotes=" + cantCamarotes + "]";
	}

}
