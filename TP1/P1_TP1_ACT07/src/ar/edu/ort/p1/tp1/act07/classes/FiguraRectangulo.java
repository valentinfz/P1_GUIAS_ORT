package ar.edu.ort.p1.tp1.act07.classes;

public class FiguraRectangulo extends Figura {

	private double base;
	private double altura;

	public FiguraRectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public double perimetro() {
		return 2 * (base + altura);
	}

	@Override
	public String toString() {
		return super.toString() + " [base=" + base + ", altura=" + altura + "]";
	}

}
