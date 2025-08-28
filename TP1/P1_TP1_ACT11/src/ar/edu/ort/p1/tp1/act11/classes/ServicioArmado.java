package ar.edu.ort.p1.tp1.act11.classes;

public class ServicioArmado extends Servicio {

	private static final double VALOR_POR_HORA = 250;

	public ServicioArmado(double cantHoras) {
		super(cantHoras);
	}

	@Override
	public double calcularPrecio() {
		return this.getCantHoras() * ServicioArmado.VALOR_POR_HORA;
	}

	@Override
	public double obtenerMontoDeFacturacion() {
		double precioBase = this.calcularPrecio();
		return Matematica.sumarPorcentaje(precioBase, Servicio.IVA / 2); // solo mitad del IVA
	}

}
