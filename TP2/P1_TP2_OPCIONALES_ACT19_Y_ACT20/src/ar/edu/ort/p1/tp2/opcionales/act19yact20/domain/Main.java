package ar.edu.ort.p1.tp2.opcionales.act19yact20.domain;

import ar.edu.ort.p1.tp2.opcionales.act19yact20.classes.Pyme;

public class Main {

	public static void main(String[] args) {

		Pyme pyme = new Pyme();

		System.out.println("=== Alta de empleados ===");
		System.out.println(pyme.altaEmpleado("111", "Gomez", 150000));
		System.out.println(pyme.altaEmpleado("222", "Perez", 180000));
		System.out.println(pyme.altaEmpleado("333", "Lopez", 200000));

		System.out.println("Vacantes disponibles: " + pyme.cantVacantes());
		System.out.println("Sueldo total actual: $" + pyme.sueldoTotal());

		System.out.println("\n=== Baja de empleado ===");
		System.out.println(pyme.bajaEmpleado("222"));

		System.out.println("Vacantes disponibles: " + pyme.cantVacantes());
		System.out.println("Sueldo total actual: $" + pyme.sueldoTotal());
	}
}
