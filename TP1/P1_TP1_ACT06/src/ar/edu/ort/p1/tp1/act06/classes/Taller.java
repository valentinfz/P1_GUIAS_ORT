package ar.edu.ort.p1.tp1.act06.classes;

import java.util.ArrayList;
import java.util.List;

public class Taller {

	private List<Bicicleta> bicicletas;

	public Taller() {
		this.bicicletas = new ArrayList<Bicicleta>();
	}

	public void agregarBicicletas(Bicicleta bicicleta) {
		this.bicicletas.add(bicicleta);
		System.out.println("Se agrego: " + bicicleta);
	}

	public int cantServiciosPosibles() {
		int cantidad = 0;

		for (Bicicleta bicicleta : this.bicicletas) {
			if (bicicleta.cumpleRequisitos()) {
				cantidad++;
			}
		}
		return cantidad;
	}

}
