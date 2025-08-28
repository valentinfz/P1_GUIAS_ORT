package ar.edu.ort.p1.tp1.act07.classes;

public class FiguraCircunferencia extends Figura {

	private double radio;

	public FiguraCircunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public String toString() {
		return super.toString() + " [radio=" + radio + "]";
	}

}
