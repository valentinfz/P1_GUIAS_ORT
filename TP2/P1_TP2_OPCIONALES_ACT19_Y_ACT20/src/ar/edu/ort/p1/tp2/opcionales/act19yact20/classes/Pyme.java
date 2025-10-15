package ar.edu.ort.p1.tp2.opcionales.act19yact20.classes;

public class Pyme {

	private static final int CANT_EMPLEADOS = 665;

	private Empleado[] empleados;
	private int cantRegistrados;

	public Pyme() {
		this.empleados = new Empleado[CANT_EMPLEADOS];
		this.cantRegistrados = 0;
	}

	public double sueldoTotal() {
		double total = 0;
		int recorridos = 0;
		int i = 0;

		while (i < this.empleados.length && recorridos < this.cantRegistrados) {
			if (this.empleados[i] != null) {
				total += this.empleados[i].getSueldo();
				recorridos++;
			}
			i++;
		}
		return total;
	}

	public int cantVacantes() {
		return CANT_EMPLEADOS - this.cantRegistrados;
	}

	public int altaEmpleado(String dni, String apellido, double sueldo) {
		int posicion = -1;
		Empleado empleado = this.buscarEmpleado(dni);

		if (!this.existeEmpleado(empleado)) {
			empleado = this.crearEmpleado(dni, apellido, sueldo);
			posicion = this.agregarEmpleado(empleado);
			this.cantRegistrados++;
		}
		return posicion;
	}

	public Empleado bajaEmpleado(String dni) {
		Empleado empleado = this.buscarEmpleado(dni);
		int posicion = this.buscarPosicion(dni);

		if (this.existeEmpleado(empleado)) {
			if (this.esPosicionValida(posicion)) {
				this.eliminarEmpleado(posicion);
				this.cantRegistrados--;
			}
		}
		return empleado;
	}

	private void eliminarEmpleado(int posicion) {
		this.empleados[posicion] = null;
	}

	private boolean existeEmpleado(Empleado empleado) {
		return empleado != null;
	}

	private boolean esPosicionValida(int posicion) {
		return posicion >= 0 && posicion <= this.empleados.length - 1;
	}

	private int agregarEmpleado(Empleado empleado) {
		boolean vendedorColocado = false;
		int i = 0;

		while (i < this.empleados.length && vendedorColocado == false) {
			if (this.empleados[i] == null) {
				this.empleados[i] = empleado;
				vendedorColocado = true;
			} else {
				i++;
			}
		}
		return i;
	}

	private int buscarPosicion(String dni) {
		int pocisionEncontrada = -1;
		Empleado empleado;
		int i = 0;

		while (i < this.empleados.length && pocisionEncontrada == -1) {
			empleado = this.empleados[i];
			if (empleado != null && empleado.mismoDni(dni)) {
				pocisionEncontrada = i;
			} else {
				i++;
			}
		}
		return pocisionEncontrada;
	}

	private Empleado buscarEmpleado(String dni) {
		Empleado empleadoEncontrado = null;
		Empleado empleado;
		int i = 0;

		while (i < this.empleados.length && empleadoEncontrado == null) {
			empleado = this.empleados[i];
			if (empleado != null && empleado.mismoDni(dni)) {
				empleadoEncontrado = empleado;
			} else {
				i++;
			}
		}
		return empleadoEncontrado;
	}

	private Empleado crearEmpleado(String dni, String apellido, double sueldo) {
		return new Empleado(dni, apellido, sueldo);
	}

}
