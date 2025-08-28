package ar.edu.ort.p1.tp1.act14.classes;

public class ItemBebida extends Item {

	private int tamanioEnCC;
	private boolean tieneAlcohol;

	public ItemBebida(String nombre, double precio, int tamanioEnCC, boolean tieneAlcohol) {
		super(nombre, precio);
		this.tamanioEnCC = tamanioEnCC;
		this.tieneAlcohol = tieneAlcohol;
	}

	@Override
	public double calcularDescuento() {
		double porcentaje = 0;

		if (!bebidaTieneAlcohol()) {
			porcentaje += 0.10; // 10% descuento
		} else {
			porcentaje += 0.03; // 3% descuento
		}
		return porcentaje; // porcentaje final
	}

	private boolean bebidaTieneAlcohol() {
		return tieneAlcohol;
	}

}
