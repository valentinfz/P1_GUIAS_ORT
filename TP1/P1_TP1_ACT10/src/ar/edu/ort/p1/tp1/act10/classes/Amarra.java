package ar.edu.ort.p1.tp1.act10.classes;

public class Amarra {

	private static final double VALOR_INICIAL = 10000.0;
	private static final double VALOR_ADICIONAL = 2500.0;

	private int numId;
	private String ubicacion;
	private boolean estaDisponible;
	private Barco barco;

	public Amarra(int numId, String ubicacion, boolean estaDisponible, Barco barco) {
		this.numId = numId;
		this.ubicacion = ubicacion;
		this.estaDisponible = estaDisponible;
		this.barco = barco;
	}

	public static double getValorInicial() {
		return VALOR_INICIAL;
	}

	public static double getValorAdicional() {
		return VALOR_ADICIONAL;
	}

	public Barco getBarco() {
		return barco;
	}

}
