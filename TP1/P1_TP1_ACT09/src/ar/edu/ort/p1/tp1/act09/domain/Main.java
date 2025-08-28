package ar.edu.ort.p1.tp1.act09.domain;

import ar.edu.ort.p1.tp1.act09.classes.Cabina;
import ar.edu.ort.p1.tp1.act09.classes.Estacion;
import ar.edu.ort.p1.tp1.act09.classes.MedioDePago;
import ar.edu.ort.p1.tp1.act09.classes.MedioDePagoEfectivo;
import ar.edu.ort.p1.tp1.act09.classes.PagoDigitalPase;
import ar.edu.ort.p1.tp1.act09.classes.PagoDigitalSube;
import ar.edu.ort.p1.tp1.act09.classes.Vehiculo;
import ar.edu.ort.p1.tp1.act09.enums.Categoria;

public class Main {

	public static void main(String[] args) {

		// Crear estación
		Estacion estacion = new Estacion("EST-001", "Panamericana - Norte");

		// Crear medios de pago
		MedioDePago mpEfectivo = new MedioDePagoEfectivo("Efectivo");
		MedioDePago mpSube = new PagoDigitalSube("Tarjeta SUBE", 2); // 10% descuento
		MedioDePago mpPase = new PagoDigitalPase("TelePASE", 6); // 12% descuento (porque hay demora)

		// Crear cabinas y asignar medio de pago
		Cabina cabina1 = new Cabina(1, mpEfectivo);
		Cabina cabina2 = new Cabina(2, mpSube);
		Cabina cabina3 = new Cabina(3, mpPase);

		// Agregar cabinas a estación
		estacion.agregarCabina(cabina1);
		estacion.agregarCabina(cabina2);
		estacion.agregarCabina(cabina3);

		// Crear vehículos
		Vehiculo auto = new Vehiculo("ABC123CD", Categoria.AUTO); // tarifa base 1000
		Vehiculo moto = new Vehiculo("MOT456GH", Categoria.MOTO); // tarifa base 700
		Vehiculo camion = new Vehiculo("CAM789XY", Categoria.CAMION); // tarifa base 1500

		// Cobrar a los vehículos
		System.out.println("--- COBROS ---");
		System.out.println("Auto paga en cabina1 (Efectivo): $" + cabina1.cobrar(auto));
		System.out.println("Moto paga en cabina2 (SUBE): $" + cabina2.cobrar(moto));
		System.out.println("Camión paga en cabina3 (PASE): $" + cabina3.cobrar(camion));

		// Mostrar cabinas con efectivo
		System.out.println("\n--- CABINAS CON EFECTIVO ---");
		estacion.mostrarCabinasConEfectivo();

		// Mostrar promedio de demora
		System.out.println("\n--- PROMEDIO DE DEMORA DIGITAL ---");
		System.out.println("Promedio: " + estacion.promedioDemora() + " días");
	}
}
