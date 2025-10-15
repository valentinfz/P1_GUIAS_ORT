package ar.edu.ort.p1.tp2.act01.dtos;

public class DetallePedido {

	private double monto;
	private String apellidoCajero;
	private int nivelBateriaRobot;

	public DetallePedido(double monto, String apellidoCajero, int nivelBateriaRobot) {
		this.monto = monto;
		this.apellidoCajero = apellidoCajero;
		this.nivelBateriaRobot = nivelBateriaRobot;
	}

}
