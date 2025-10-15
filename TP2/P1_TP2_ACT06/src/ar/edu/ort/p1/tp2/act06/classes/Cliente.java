package ar.edu.ort.p1.tp2.act06.classes;

import ar.edu.ort.p1.tp2.act06.enums.TipoPais;

public class Cliente {

	private String cuit;
	private String razonSocial;
	private int telefono;
	private TipoPais pais;

	public Cliente(String cuit, String razonSocial, int telefono, TipoPais pais) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.pais = pais;
	}

	public String getCuit() {
		return cuit;
	}

	public TipoPais getPais() {
		return pais;
	}

	public boolean mismoPais(TipoPais pais) {
		return this.pais == pais;
	}

	public boolean mismoCuit(String cuit) {
		return this.cuit.equals(cuit);
	}

	@Override
	public String toString() {
		return "Cliente [cuit=" + cuit + ", razonSocial=" + razonSocial + ", telefono=" + telefono + ", tipoPais="
				+ pais + "]";
	}

}
