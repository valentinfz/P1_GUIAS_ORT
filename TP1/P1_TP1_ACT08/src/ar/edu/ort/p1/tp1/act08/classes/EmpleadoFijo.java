package ar.edu.ort.p1.tp1.act08.classes;

import ar.edu.ort.p1.tp1.act08.enums.RangoAntiguedad;

public class EmpleadoFijo extends Empleado {

	private RangoAntiguedad antiguedad;

	public EmpleadoFijo(String dni, String nombreYApellido, int anioDeIngreso, RangoAntiguedad antiguedad) {
		super(dni, nombreYApellido, anioDeIngreso);
		this.antiguedad = antiguedad;
	}

	@Override
	public double calcularSalario() {
		double porcentaje = this.antiguedad.getPorcentaje();
		return EmpleadoFijo.SUELDO_FIJO * (1 + porcentaje);
	}

	@Override
	public String toString() {
		return super.toString() + " [antiguedad=" + antiguedad + "]";
	}

}
