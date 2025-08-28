package ar.edu.ort.p1.tp1.act08.classes;

public class EmpleadoComision extends Empleado {

	private int cantClientes;
	private double montoPorCliente;

	public EmpleadoComision(String dni, String nombreYApellido, int anioDeIngreso, int cantClientes,
			double montoPorCliente) {
		super(dni, nombreYApellido, anioDeIngreso);
		this.cantClientes = cantClientes;
		this.montoPorCliente = montoPorCliente;
	}

	public int getCantClientes() {
		return cantClientes;
	}

	@Override
	public double calcularSalario() {
		double salarioFinal;

		if (this.superaElSalarioMinimo()) {
			salarioFinal = (Empleado.SUELDO_FIJO + this.cantClientes * this.montoPorCliente);
		} else {
			salarioFinal = Empleado.SUELDO_FIJO;
		}
		return salarioFinal;
	}

	@Override
	public String toString() {
		return super.toString() + " [cantClientes=" + cantClientes + ", montoPorCliente=" + montoPorCliente + "]";
	}

	private boolean superaElSalarioMinimo() {
		return this.cantClientes * this.montoPorCliente > Empleado.SUELDO_FIJO;
	}

}
