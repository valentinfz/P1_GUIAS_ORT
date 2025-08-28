package ar.edu.ort.p1.tp1.act09.classes;

import java.util.ArrayList;
import java.util.List;

public class Estacion {

	private static final int HORA_ACTUAL = 16;

	private String id;
	private String descripcion;
	private List<Cabina> cabinas;

	public Estacion(String id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		this.cabinas = new ArrayList<Cabina>();
	}

	public static int dameHoraActual() {
		return HORA_ACTUAL;
	}

	public void agregarCabina(Cabina cabina) {
		this.cabinas.add(cabina);
	}

	public void mostrarCabinasConEfectivo() {
		ArrayList<Cabina> listaCabinasEfectivo = this.cabinasConEfectivo();

		for (Cabina cabina : listaCabinasEfectivo) {
			System.out.println(cabina);
		}
	}

	public double promedioDemora() {
		int cantidad = 0;
		int acumuladorDiasDemora = 0;
		MedioDePagoDigital medioDePagoDigital;

		for (Cabina cabina : this.cabinas) {
			if (cabina.getMedioDePago() instanceof MedioDePagoDigital) {
				medioDePagoDigital = (MedioDePagoDigital) cabina.getMedioDePago();
				acumuladorDiasDemora += medioDePagoDigital.getDiasDemora();
				cantidad++;
			}
		}
		return (double) acumuladorDiasDemora / cantidad;
	}

	@Override
	public String toString() {
		return "Estacion [id=" + id + ", descripcion=" + descripcion + ", cabinas=" + cabinas + "]";
	}

	private ArrayList<Cabina> cabinasConEfectivo() {
		ArrayList<Cabina> listaCabinasEfectivo = new ArrayList<Cabina>();

		for (Cabina cabina : this.cabinas) {
			if (cabina.getMedioDePago() instanceof MedioDePagoEfectivo) {
				listaCabinasEfectivo.add(cabina);
			}
		}
		return listaCabinasEfectivo;
	}

}
