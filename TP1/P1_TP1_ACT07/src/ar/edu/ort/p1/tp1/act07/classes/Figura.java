package ar.edu.ort.p1.tp1.act07.classes;

public abstract class Figura {

	private String color;

	public Figura(String color) {
		this.color = color;
	}

	public abstract double area();

	public abstract double perimetro();

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}

}
