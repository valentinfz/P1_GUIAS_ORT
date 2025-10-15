package ar.edu.ort.p1.tp2.act08.classes;

public class Reserva {

	private String id;
	private int dni;
	private int numAsiento;

	public Reserva(String id, int dni, int numAsiento) {
		this.id = id;
		this.dni = dni;
		this.numAsiento = numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		final int MINIMO = 1;
		final int MAXIMO = 96;

		if (numAsiento >= MINIMO && numAsiento <= MAXIMO) {
			this.numAsiento = numAsiento;
		} else {
			System.out.println("Numero no permitido");
		}
	}

	public String getId() {
		return id;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", dni=" + dni + ", numAsiento=" + numAsiento + "]";
	}

}
