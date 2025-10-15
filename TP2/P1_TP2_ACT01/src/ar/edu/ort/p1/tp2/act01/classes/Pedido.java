package ar.edu.ort.p1.tp2.act01.classes;

public class Pedido {

	private String nombreCliente;
	private int idCajero;
	private String codigoRobot;
	private double monto;

	public Pedido(String nombreCliente, int idCajero, String codigoRobot, double monto) {
		this.nombreCliente = nombreCliente;
		this.idCajero = idCajero;
		this.codigoRobot = codigoRobot;
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}

}
