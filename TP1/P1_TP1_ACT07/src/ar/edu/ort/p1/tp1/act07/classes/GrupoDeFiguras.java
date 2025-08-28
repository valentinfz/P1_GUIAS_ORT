package ar.edu.ort.p1.tp1.act07.classes;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeFiguras {

	private List<Figura> figuras;

	public GrupoDeFiguras() {
		this.figuras = new ArrayList<Figura>();
	}

	public void agregarFigura(Figura figura) {
		this.figuras.add(figura);
	}

	public double areaTotal() {
		double total = 0;

		for (Figura figura : figuras) {
			total += figura.area();
		}
		return total;
	}

	public double perimetroTotal() {
		double total = 0;

		for (Figura figura : figuras) {
			total += figura.perimetro();
		}
		return total;
	}

	public void mostrarFiguras() {
		for (Figura figura : figuras) {
			System.out.println(figura);
		}
	}
}
