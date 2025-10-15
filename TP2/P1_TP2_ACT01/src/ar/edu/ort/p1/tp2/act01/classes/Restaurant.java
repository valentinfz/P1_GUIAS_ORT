package ar.edu.ort.p1.tp2.act01.classes;

import java.awt.Robot;
import java.util.ArrayList;

import ar.edu.ort.p1.tp2.act01.dtos.DetallePedido;

public class Restaurant {

	private Cajero[] cajeros;
	private Robot[] robots;

	public Restaurant() {
		super();
		this.cajeros = new Cajero[5];
		this.robots = new Robot[8];
	}

	public ArrayList<DetallePedido> informeDePedidos() {
		ArrayList<DetallePedido> listaDetallePedidos = new ArrayList<DetallePedido>();
		DetallePedido detallePedido;

		detallePedido = this.crearDetallePedido();

	}

	private DetallePedido crearDetallePedido(double monto, String apellidoCajero, int nivelBateriaRobot) {
		return new DetallePedido(monto, apellidoCajero, nivelBateriaRobot);
	}

	private buscarCajero()

}

}
