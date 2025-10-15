package ar.edu.ort.p1.tp2.act06.classes;

public class Item {

	private Producto producto;
	private int cantidad;

	public Item(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public double obtenerTotal() {
		return this.cantidad * this.producto.getPrecio();
	}

	@Override
	public String toString() {
		return "Item [producto=" + producto + ", cantidad=" + cantidad + "]";
	}

}
