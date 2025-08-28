package ar.edu.ort.p1.tp1.act11.classes;

public class ServicioReparacion extends Servicio {

	private static double VALOR_POR_HORA = 180;

	private int dificultad; // (entero entre 1 y 5)

	public ServicioReparacion(double cantHoras, int dificultad) {
		super(cantHoras);
		this.dificultad = dificultad;
	}

	public boolean esReparacionSimple() {
		return this.dificultad < 2;
	}

	@Override
	public double calcularPrecio() {
		int dificultadFijada = 3;
		double resultado;
		double precioBase;

		precioBase = this.getCantHoras() * ServicioReparacion.VALOR_POR_HORA;

		if (this.dificultad > dificultadFijada) {
			resultado = precioBase * 25 / 100;
		} else {
			resultado = precioBase;
		}
		return resultado;
	}

	@Override
	public double obtenerMontoDeFacturacion() {
		double precioBase = this.calcularPrecio();
		return Matematica.sumarPorcentaje(precioBase, IVA / 2); // solo mitad del IVA
	}

}
