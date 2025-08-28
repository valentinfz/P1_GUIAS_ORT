package ar.edu.ort.p1.tp1.act13.classes;

public class Metodo {

	private String nombre;
	private int cantParametros;
	private int cantInstrucciones;
	private int cantRamificaciones;

	public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamificaciones) {
		this.nombre = nombre;
		this.cantParametros = cantParametros;
		this.cantInstrucciones = cantInstrucciones;
		this.cantRamificaciones = cantRamificaciones;
	}

	public double promedioIndiceCalidad() {
		return 5 / (this.cantParametros + 1) + 20 / this.cantInstrucciones + 3 / (this.cantRamificaciones + 1);

	}

	public boolean mismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	public void mostrarDatosRelevantes() {
		System.out.println("Cantidad parametros: " + this.cantParametros + " Cantidad de instrucciones: "
				+ this.cantInstrucciones + " Cantidad de ramificaciones: " + this.cantRamificaciones);
	}

	@Override
	public String toString() {
		return "Metodo [nombre=" + nombre + ", cantParametros=" + cantParametros + ", cantInstrucciones="
				+ cantInstrucciones + ", cantRamificaciones=" + cantRamificaciones + "]";
	}

}
