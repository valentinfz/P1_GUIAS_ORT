package ar.edu.ort.p1.tp1.act07.classes;

public class FiguraTrianguloEquilatero extends Figura {

	private double lado;

	public FiguraTrianguloEquilatero(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * lado * lado;
	}

	@Override
	public double perimetro() {
		return 3 * lado;
	}

	@Override
	public String toString() {
		return super.toString() + " [lado=" + lado + "]";
	}

}
