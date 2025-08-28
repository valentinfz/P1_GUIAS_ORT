package ar.edu.ort.p1.tp1.act13.classes;

public class FuenteMarcado extends Fuente {

	private double tamanioArchivo;

	public FuenteMarcado(String nombre, String ruta, double tamanioArchivo) {
		super(nombre, ruta);
		this.tamanioArchivo = tamanioArchivo;
	}

	@Override
	public double calcularIndiceCalidad() {
		return 450 / this.tamanioArchivo;
	}

	@Override
	public String toString() {
		return super.toString() + "FuenteMarcado [tamanioArchivo=" + tamanioArchivo + "]";
	}

}
