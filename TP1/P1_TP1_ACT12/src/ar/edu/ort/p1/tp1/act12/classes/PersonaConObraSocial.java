package ar.edu.ort.p1.tp1.act12.classes;

import ar.edu.ort.p1.tp1.act12.enums.TipoMotivo;

public class PersonaConObraSocial extends Persona {

	private String nombrePrestador;
	private int numeroAfiliado;

	public PersonaConObraSocial(String dni, String nombreYApellido, int edad, TipoMotivo motivo, String nombrePrestador,
			int numeroAfiliado) {
		super(dni, nombreYApellido, edad, motivo);
		this.nombrePrestador = nombrePrestador;
		this.numeroAfiliado = numeroAfiliado;
	}

}
