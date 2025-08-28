package ar.edu.ort.p1.tp1.act10.classes;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

	private String ciudad;
	private List<Amarra> amarras;

	public Puerto(String ciudad) {
		this.ciudad = ciudad;
		this.amarras = new ArrayList<Amarra>();
	}

	public void agregarAmarra(Amarra amarra) {
		this.amarras.add(amarra);
	}

	public int barcosConAlquilerMayorA(double importe) {
		int contador = 0;

		for (Amarra amarra : this.amarras) {
			if (amarra.getBarco().calcularImporteFinal() > importe) {
				contador++;
			}
		}
		return contador;
	}

	public BarcoDeportivo barcoConMayorConsumo() {
		ArrayList<BarcoDeportivo> listaBarcosDeportivos = this.obtenerBarcosDeportivos();
		BarcoDeportivo mejor = null;
		BarcoDeportivo actual;

		if (!listaBarcosDeportivos.isEmpty()) {
			mejor = listaBarcosDeportivos.get(0);

			for (int i = 1; i < listaBarcosDeportivos.size(); i++) {
				actual = listaBarcosDeportivos.get(i);

				if (actual.calcularConsumo() > mejor.calcularConsumo()) {
					mejor = actual;
				}
			}
		}
		return mejor;
	}

	private ArrayList<BarcoDeportivo> obtenerBarcosDeportivos() {
		ArrayList<BarcoDeportivo> listaBarcosDeportivos = new ArrayList<BarcoDeportivo>();
		BarcoDeportivo barcoDeportivo;

		for (Amarra amarra : this.amarras) {
			if (amarra.getBarco() instanceof BarcoDeportivo) {
				barcoDeportivo = (BarcoDeportivo) amarra.getBarco();
				listaBarcosDeportivos.add(barcoDeportivo);
			}
		}
		return listaBarcosDeportivos;
	}

}
