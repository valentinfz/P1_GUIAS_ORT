package ar.edu.ort.p1.tp2.act05.domain;

import ar.edu.ort.p1.tp2.act05.classes.Camion;
import ar.edu.ort.p1.tp2.act05.classes.Chofer;
import ar.edu.ort.p1.tp2.act05.classes.Empresa;
import ar.edu.ort.p1.tp2.act05.classes.Viaje;

public class Main {
	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		// --- Agregar camiones ---
		empresa.agregarCamion(new Camion(0, 50.0));
		empresa.agregarCamion(new Camion(1, 70.0));

		// --- Agregar choferes ---
		empresa.agregarChofer(new Chofer("C1", "Juan", 1000));
		empresa.agregarChofer(new Chofer("C2", "Ana", 1200));

		// --- Registrar viajes ---
		empresa.agregarViaje(new Viaje(0, "C1", 100)); // Chofer C1 con Camion 0
		empresa.agregarViaje(new Viaje(1, "C1", 200)); // Chofer C1 con Camion 1
		empresa.agregarViaje(new Viaje(0, "C2", 150)); // Chofer C2 con Camion 0

		// --- Mostrar costos ---
		System.out.println(">>> Costos de viajes:");
		empresa.mostrarCostosDeViajes();

		// --- Mostrar matriz de viajes por chofer y camión ---
		System.out.println("\n>>> Matriz de viajes por Chofer-Camion:");
		empresa.mostrarViajesXChoferCamion();
	}
}