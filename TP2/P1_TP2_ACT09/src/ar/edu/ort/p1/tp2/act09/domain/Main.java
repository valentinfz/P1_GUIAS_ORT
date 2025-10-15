package ar.edu.ort.p1.tp2.act09.domain;

import ar.edu.ort.p1.tp2.act09.classes.Auto;
import ar.edu.ort.p1.tp2.act09.classes.Estacionamiento;
import ar.edu.ort.p1.tp2.act09.classes.Fecha;
import ar.edu.ort.p1.tp2.act09.classes.Pago;

public class Main {

	public static void main(String[] args) {
		Estacionamiento estacionamiento = new Estacionamiento();
		int mesActual = Fecha.hoy().getMes();

		// Crear autos
		Auto auto1 = new Auto("ABC123", new Fecha(10, 1, Fecha.hoy().getAnio()));
		Auto auto2 = new Auto("DEF456", new Fecha(5, 2, Fecha.hoy().getAnio()));
		Auto auto3 = new Auto("GHI789", new Fecha(20, 3, Fecha.hoy().getAnio()));
		Auto auto4 = new Auto("JKL012", new Fecha(15, 1, Fecha.hoy().getAnio()));
		Auto auto5 = new Auto("MNO345", new Fecha(25, 2, Fecha.hoy().getAnio()));
		Auto auto6 = new Auto("PQR678", new Fecha(1, 3, Fecha.hoy().getAnio()));

		// Agregar pagos: algunos autos al día, otros morosos
		// Auto1: al día
		for (int m = 1; m <= mesActual; m++) {
			auto1.agregarPago(new Pago(1000, "11111111"), m);
		}

		// Auto2: moroso el mes actual
		for (int m = 1; m < mesActual; m++) {
			auto2.agregarPago(new Pago(1000, "22222222"), m);
		}

		// Auto3: al día solo desde marzo
		for (int m = 3; m <= mesActual; m++) {
			auto3.agregarPago(new Pago(1000, "33333333"), m);
		}

		// Auto4: al día
		for (int m = 1; m <= mesActual; m++) {
			auto4.agregarPago(new Pago(1000, "44444444"), m);
		}

		// Auto5: moroso, solo pagó febrero
		auto5.agregarPago(new Pago(1000, "55555555"), 2);

		// Auto6: moroso, solo pagó marzo
		auto6.agregarPago(new Pago(1000, "66666666"), 3);

		// Agregar autos al estacionamiento
		estacionamiento.agregarAuto(auto1);
		estacionamiento.agregarAuto(auto2);
		estacionamiento.agregarAuto(auto3);
		estacionamiento.agregarAuto(auto4);
		estacionamiento.agregarAuto(auto5);
		estacionamiento.agregarAuto(auto6);

		// Mostrar estado inicial
		System.out.println("\nEstado del estacionamiento:");
		estacionamiento.mostrarEstado();

		// Intentar retirar autos
		System.out.println("\nIntentando retirar auto en posición 00:");
		Auto retirado1 = estacionamiento.retirar(0);
		if (retirado1 != null) {
			System.out.println("Auto retirado: " + retirado1.getPatente());
		}

		System.out.println("\nIntentando retirar auto en posición 01:");
		Auto retirado2 = estacionamiento.retirar(1);
		if (retirado2 != null) {
			System.out.println("Auto retirado: " + retirado2.getPatente());
		}

		System.out.println("\nIntentando retirar auto en posición 02:");
		Auto retirado3 = estacionamiento.retirar(2);
		if (retirado3 != null) {
			System.out.println("Auto retirado: " + retirado3.getPatente());
		}

		System.out.println("\nAutos más morosos por piso:");
		estacionamiento.mostrarAutosMasMorososPorPiso();

		System.out.println("\nEstado final del estacionamiento:");
		estacionamiento.mostrarEstado();
	}
}
