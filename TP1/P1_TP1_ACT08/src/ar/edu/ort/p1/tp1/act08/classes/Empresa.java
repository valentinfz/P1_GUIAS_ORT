package ar.edu.ort.p1.tp1.act08.classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private List<Empleado> empleados;

	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void mostrarSalarios() {
		for (Empleado empleado : this.empleados) {
			System.out.println("Empleado: " + empleado.getDni() + " Sueldo: " + empleado.calcularSalario());
		}
	}

	// El mejor arranca en pos 0 y luego empiezo a comparar desde pos 1
	public EmpleadoComision empleadoConMasClientes() {
		ArrayList<EmpleadoComision> listaEmpleadosComision = this.obtenerEmpleadosComision();
		EmpleadoComision mejorEmpleado = null;
		EmpleadoComision empleadoActual;

		if (!listaEmpleadosComision.isEmpty()) {
			mejorEmpleado = listaEmpleadosComision.get(0);

			for (int i = 1; i < listaEmpleadosComision.size(); i++) {
				empleadoActual = listaEmpleadosComision.get(i);
				if (empleadoActual.getCantClientes() > mejorEmpleado.getCantClientes()) {
					mejorEmpleado = empleadoActual;
				}
			}
		}
		return mejorEmpleado;
	}

	private ArrayList<EmpleadoComision> obtenerEmpleadosComision() {
		ArrayList<EmpleadoComision> listaEmpleadosComision = new ArrayList<EmpleadoComision>();
		EmpleadoComision empleadoComision;

		for (Empleado empleado : this.empleados) {
			if (empleado instanceof EmpleadoComision) {
				empleadoComision = (EmpleadoComision) empleado;
				listaEmpleadosComision.add(empleadoComision);
			}
		}
		return listaEmpleadosComision;
	}

}
