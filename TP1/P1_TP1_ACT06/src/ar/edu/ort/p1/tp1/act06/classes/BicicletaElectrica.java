package ar.edu.ort.p1.tp1.act06.classes;

public class BicicletaElectrica extends Bicicleta {

	private static final int WATTS_MAXIMOS = 250;

	private int potencia;

	public BicicletaElectrica(String marca, String modelo, int kilometros, int potencia) {
		super(marca, modelo, kilometros);
		this.potencia = potencia;
	}

	@Override
	public boolean cumpleRequisitos() {
		return this.potencia <= BicicletaElectrica.WATTS_MAXIMOS && super.cumpleRequisitos();
	}

	@Override
	public String toString() {
		return super.toString() + " [potencia=" + potencia + "]";
	}

}
