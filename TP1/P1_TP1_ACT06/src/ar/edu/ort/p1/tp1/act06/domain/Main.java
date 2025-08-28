package ar.edu.ort.p1.tp1.act06.domain;

import ar.edu.ort.p1.tp1.act06.classes.Bicicleta;
import ar.edu.ort.p1.tp1.act06.classes.BicicletaElectrica;
import ar.edu.ort.p1.tp1.act06.classes.Taller;

public class Main {
	public static void main(String[] args) {
		Taller taller = new Taller();

		Bicicleta b1 = new Bicicleta("Venzo", "X1", 1500);
		Bicicleta b2 = new Bicicleta("Raleigh", "Urban", 2100);
		BicicletaElectrica be1 = new BicicletaElectrica("Philco", "Volt", 3000, 200);
		BicicletaElectrica be2 = new BicicletaElectrica("Xiaomi", "MiBike", 1000, 300);

		taller.agregarBicicletas(b1);
		taller.agregarBicicletas(b2);
		taller.agregarBicicletas(be1);
		taller.agregarBicicletas(be2);

		System.out.println("Servicios posibles: " + taller.cantServiciosPosibles()); // Debería dar 1
	}
}
