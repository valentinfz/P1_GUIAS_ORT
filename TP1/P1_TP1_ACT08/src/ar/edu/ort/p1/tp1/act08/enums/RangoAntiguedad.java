package ar.edu.ort.p1.tp1.act08.enums;

public enum RangoAntiguedad {

	MENOS_DE_2(0), ENTRE_2_Y_5(0.05), ENTRE_6_Y_10(0.10), MAS_DE_10(0.15);

	private double porcentaje;

	private RangoAntiguedad(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getPorcentaje() {
		return porcentaje;
	}
}
