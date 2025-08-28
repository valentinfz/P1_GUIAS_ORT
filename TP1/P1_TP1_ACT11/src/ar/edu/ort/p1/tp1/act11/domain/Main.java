package ar.edu.ort.p1.tp1.act11.domain;

import ar.edu.ort.p1.tp1.act11.classes.Comercio;
import ar.edu.ort.p1.tp1.act11.classes.Insumo;
import ar.edu.ort.p1.tp1.act11.classes.ServicioArmado;
import ar.edu.ort.p1.tp1.act11.classes.ServicioReparacion;
import ar.edu.ort.p1.tp1.act11.enums.TipoInsumo;

public class Main {

	public static void main(String[] args) {

		// Crear el comercio
		Comercio comercio = new Comercio();

		// Insumos
		Insumo insumo1 = new Insumo("Teclado mecánico", TipoInsumo.PERIFERICO, 30, 10000);
		Insumo insumo2 = new Insumo("SSD 1TB", TipoInsumo.HARDWARE, 25, 30000);
		Insumo insumo3 = new Insumo("Kit limpieza", TipoInsumo.LIMPIEZA, 15, 5000);

		// Servicios
		ServicioArmado armadoPc = new ServicioArmado(4); // 4 horas
		ServicioReparacion reparacionSimple = new ServicioReparacion(0.5, 1); // dificultad < 2
		ServicioReparacion reparacionCompleja = new ServicioReparacion(2, 5); // dificultad > 2

		// Agregamos los elementos a la lista
		comercio.agregarItemFacturable(insumo1);
		comercio.agregarItemFacturable(insumo2);
		comercio.agregarItemFacturable(insumo3);
		comercio.agregarItemFacturable(armadoPc);
		comercio.agregarItemFacturable(reparacionSimple);
		comercio.agregarItemFacturable(reparacionCompleja);

		// Mostrar el total facturado
		System.out.printf("Monto total facturado: $%.2f\n", comercio.montoTotalFacturado());

		// Mostrar la cantidad de servicios de reparación simples
		System.out.println("Cantidad de servicios de reparación simples: " + comercio.cantServiciosSimples());
	}
}
