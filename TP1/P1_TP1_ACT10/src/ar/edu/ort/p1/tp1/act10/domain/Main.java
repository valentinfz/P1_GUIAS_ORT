package ar.edu.ort.p1.tp1.act10.domain;

import ar.edu.ort.p1.tp1.act10.classes.Amarra;
import ar.edu.ort.p1.tp1.act10.classes.Barco;
import ar.edu.ort.p1.tp1.act10.classes.BarcoDeportivo;
import ar.edu.ort.p1.tp1.act10.classes.BarcoVelero;
import ar.edu.ort.p1.tp1.act10.classes.BarcoYate;
import ar.edu.ort.p1.tp1.act10.classes.DeportivoComun;
import ar.edu.ort.p1.tp1.act10.classes.DeportivoLujo;
import ar.edu.ort.p1.tp1.act10.classes.Puerto;

public class Main {

	public static void main(String[] args) {

		// Crear el puerto
		Puerto puerto = new Puerto("Paraná");

		// Crear barcos
		Barco velero = new BarcoVelero("Juan Pérez", "VEL123", 8.5, 2010, 2);
		Barco yate = new BarcoYate("Laura Gómez", "YAT456", 12.0, 2015, 3);
		Barco deportivoComun = new DeportivoComun("Carlos Díaz", "DEP789", 10.0, 2018, 300, 2);
		Barco deportivoLujo = new DeportivoLujo("Sofía Torres", "LUX999", 15.0, 2020, 500, 3);

		// Crear amarras (todas ocupadas)
		puerto.agregarAmarra(new Amarra(1, "Zona A", false, velero));
		puerto.agregarAmarra(new Amarra(2, "Zona B", false, yate));
		puerto.agregarAmarra(new Amarra(3, "Zona C", false, deportivoComun));
		puerto.agregarAmarra(new Amarra(4, "Zona D", false, deportivoLujo));

		// Mostrar importes de alquiler
		System.out.println("--- IMPORTES DE ALQUILER ---");
		System.out.println("Velero: $" + velero.calcularImporteFinal());
		System.out.println("Yate: $" + yate.calcularImporteFinal());
		System.out.println("Deportivo común: $" + deportivoComun.calcularImporteFinal());
		System.out.println("Deportivo de lujo: $" + deportivoLujo.calcularImporteFinal());

		// Consultar cuántos barcos superan cierto importe
		double importeLimite = 150000;
		int barcosMayores = puerto.barcosConAlquilerMayorA(importeLimite);
		System.out.println("\nCantidad de barcos con alquiler mayor a $" + importeLimite + ": " + barcosMayores);

		// Mostrar barco deportivo con mayor consumo
		BarcoDeportivo maxConsumo = puerto.barcoConMayorConsumo();
		System.out.println("\nBarco deportivo de mayor consumo:");
		System.out.println(maxConsumo);

	}
}
