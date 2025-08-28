package ar.edu.ort.p1.tp1.act14.classes;

public class ItemPlato extends Item {

	private String descripcion;
	private boolean esVegano;
	private boolean esAptoCeliacos;

	public ItemPlato(String nombre, double precio, String descripcion, boolean esVegano, boolean esAptoCeliacos) {
		super(nombre, precio);
		this.descripcion = descripcion;
		this.esVegano = esVegano;
		this.esAptoCeliacos = esAptoCeliacos;
	}

	@Override
	public double calcularDescuento() {
		double porcentaje = 0;

		if (!esPlatoVegano()) {
			porcentaje += 0.05; // 5% descuento
		}
		if (esPlatoAptoCeliacos()) {
			porcentaje += 0.02; // 2% descuento
		}
		return porcentaje; // porcentaje final
	}

	private boolean esPlatoVegano() {
		return esVegano;
	}

	private boolean esPlatoAptoCeliacos() {
		return esAptoCeliacos;
	}

}
