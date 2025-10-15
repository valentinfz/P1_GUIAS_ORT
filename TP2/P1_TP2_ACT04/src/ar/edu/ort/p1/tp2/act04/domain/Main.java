package ar.edu.ort.p1.tp2.act04.domain;

import ar.edu.ort.p1.tp2.act04.classes.Empresa;
import ar.edu.ort.p1.tp2.act04.classes.Recorrido;
import ar.edu.ort.p1.tp2.act04.classes.Reserva;
import ar.edu.ort.p1.tp2.act04.enums.Estacion;

public class Main {
	public static void main(String[] args) {

		// 1. Creo la empresa
		Empresa empresa = new Empresa();

		// 2. Creo recorridos de prueba
		Recorrido r1 = new Recorrido(Estacion.BUENOS_AIRES, Estacion.LUJAN);
		Recorrido r2 = new Recorrido(Estacion.MERCEDES, Estacion.BRAGADO);
		Recorrido r3 = new Recorrido(Estacion.BRAGADO, Estacion.BUENOS_AIRES); // cabecera a cabecera (tiene descuento)

		// 3. Creo reservas y las agrego a la empresa
		Reserva res1 = new Reserva("R001", 2, r1); // 2 personas
		Reserva res2 = new Reserva("R002", 3, r2); // 3 personas
		Reserva res3 = new Reserva("R003", 1, r3); // 1 persona

		empresa.agregarReserva(res1);
		empresa.agregarReserva(res2);
		empresa.agregarReserva(res3);

		// 4. Muestro la recaudación total
		System.out.println("Recaudación total: $" + empresa.calcularPrecio());

		// 5. Consulto cuántas personas pasaron por Mercedes
		Estacion estacionConsulta = Estacion.MERCEDES;
		int personas = empresa.cantVecesRecorrida(estacionConsulta);
		System.out.println("Cantidad de personas que pasaron por " + estacionConsulta + ": " + personas);
	}
}
