package ar.edu.ort.p1.tp1.act13.classes;

import java.util.ArrayList;
import java.util.List;

public class Sophie {

	private List<Programa> programas;

	public Sophie() {
		this.programas = new ArrayList<Programa>();
	}

	public void agregarPrograma(Programa programa) {
		this.programas.add(programa);
	}

	public void mostrarProgramasPorDebajoDe(double umbral) {
		List<Programa> listaDeProgramas = this.programasPorDebajoDe(umbral);

		for (Programa programa : listaDeProgramas) {
			System.out.println(programa);
		}
	}

	@Override
	public String toString() {
		return "Sophie [programas=" + programas + "]";
	}

	private List<Programa> programasPorDebajoDe(double umbral) {
		List<Programa> listaDeProgramas = new ArrayList<Programa>();

		for (Programa programa : this.programas) {
			if (programa.estaPorDebajo(umbral)) {
				listaDeProgramas.add(programa);
			}
		}
		return listaDeProgramas;
	}

}
