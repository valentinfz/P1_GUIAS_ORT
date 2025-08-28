package ar.edu.ort.p1.tp1.act08.domain;

import ar.edu.ort.p1.tp1.act08.classes.EmpleadoComision;
import ar.edu.ort.p1.tp1.act08.classes.EmpleadoFijo;
import ar.edu.ort.p1.tp1.act08.classes.Empresa;
import ar.edu.ort.p1.tp1.act08.enums.RangoAntiguedad;

public class Main {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();

		EmpleadoFijo e1 = new EmpleadoFijo("12345678", "Juan Pérez", 2015, RangoAntiguedad.ENTRE_6_Y_10);
		EmpleadoFijo e2 = new EmpleadoFijo("23456789", "María López", 2022, RangoAntiguedad.MENOS_DE_2);

		EmpleadoComision ec1 = new EmpleadoComision("34567890", "Carlos Gómez", 2019, 8, 3000);
		EmpleadoComision ec2 = new EmpleadoComision("45678901", "Laura Martínez", 2020, 15, 2000);

		empresa.agregarEmpleado(e1);
		empresa.agregarEmpleado(e2);
		empresa.agregarEmpleado(ec1);
		empresa.agregarEmpleado(ec2);

		System.out.println("Listado de salarios:");
		empresa.mostrarSalarios();

		System.out.println("\nEmpleado con más clientes captados:");
		System.out.println(empresa.empleadoConMasClientes());
	}
}
