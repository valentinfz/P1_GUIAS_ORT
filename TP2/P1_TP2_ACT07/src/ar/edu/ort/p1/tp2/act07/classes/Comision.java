package ar.edu.ort.p1.tp2.act07.classes;

public class Comision {

	private String codigo;
	private int cantClases;
	private Alumno[] alumnos;
	private char[][] asistencias;

	public Comision(String codigo, Alumno[] alumnos, int cantClases) {
		this.codigo = codigo;
		this.cantClases = cantClases;
		this.alumnos = alumnos;
		this.asistencias = new char[this.alumnos.length][this.cantClases];
	}

	public void registrarAsistencia(String legajo, int claseIndex, char estado) {
		int alumnoIndex = this.buscarIndiceAlumno(legajo);

		if (alumnoIndex != -1 && claseIndex < this.cantClases) {
			this.asistencias[alumnoIndex][claseIndex] = estado;
		}
	}

	public void obtenerAsistenciasGlobales() {
		System.out.println("Comision: " + this.codigo);
		for (int i = 0; i < this.alumnos.length; i++) {
			for (int j = 0; j < this.cantClases; j++) {
				System.out.print(this.asistencias[i][j] + "\t");
			}
			System.out.println(this.calcularPorcentajeAsistencia(this.alumnos[i].getLegajo()) + "%");
		}
	}

	public void mostrarAlumnosAptos() {
		final int PORCENTAJE_APTO = 75;
		double porcentaje = 0.0;

		for (int i = 0; i < this.alumnos.length; i++) {
			porcentaje = this.calcularPorcentajeAsistencia(this.alumnos[i].getLegajo());
			if (porcentaje >= PORCENTAJE_APTO) {
				System.out.println(alumnos[i].getApellido() + ": " + porcentaje + "%");
			}
		}
	}

	public void alumnosQueDejaronLaCursada() {
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.tieneMasDe4AusenciasSeguidas(this.asistencias[i])) {
				System.out.println(this.alumnos[i].getApellido());
			}
		}
	}

	public int cantidadLlegadasTarde() {
		int cantidad = 0;

		for (int i = 0; i < this.alumnos.length; i++) {
			for (int j = 0; j < this.cantClases; j++) {
				if (this.esLlegadaTarde(this.asistencias[i][j])) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

	public int cantidadClasesAsistenciaPerfecta() {
		int cantidad = 0;
		boolean esPerfecta;

		for (int j = 0; j < this.cantClases; j++) {
			esPerfecta = true;

			for (int i = 0; i < this.alumnos.length; i++) {
				if (esAusente(this.asistencias[i][j])) {
					esPerfecta = false;
				}
			}
			if (esPerfecta) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public double[] obtenerPorcentajeDePresentismo() {
		double[] porcentajes = new double[this.cantClases];
		int cantPresentes;

		for (int j = 0; j < this.cantClases; j++) {
			cantPresentes = 0;
			for (int i = 0; i < this.alumnos.length; i++) {
				if (this.estuvoPresente(this.asistencias[i][j])) {
					cantPresentes++;
				}
			}
			porcentajes[j] = (cantPresentes * 100.0) / this.alumnos.length;
		}
		return porcentajes;
	}

	private boolean tieneMasDe4AusenciasSeguidas(char[] asistenciasAlumno) {
		final int MAXIMO_AUSENTES = 4;
		int contador = 0;
		boolean resultado = false;

		for (char asistencia : asistenciasAlumno) {
			if (this.esAusente(asistencia)) {
				contador++;
				if (contador > MAXIMO_AUSENTES) {
					resultado = true;
				}
			} else {
				contador = 0;
			}
		}
		return resultado;
	}

	private boolean esAusente(char asistencia) {
		return asistencia == 'A';
	}

	private boolean esLlegadaTarde(char asistencia) {
		return asistencia == 'T';
	}

	private boolean estuvoPresente(char asistencia) {
		return asistencia == 'P' || asistencia == 'T';

	}

	private double calcularPorcentajeAsistencia(String legajo) {
		int alumnoIndex = this.buscarIndiceAlumno(legajo);
		double suma = 0;

		for (char asistencia : this.asistencias[alumnoIndex]) {
			if (asistencia == 'P') {
				suma += 1;
			} else if (asistencia == 'T') {
				suma += 0.5;
			} else {
				suma += 0;
			}

		}
		return (suma * 100.0) / this.cantClases;
	}

	private int buscarIndiceAlumno(String legajo) {
		int indiceEncontrado = -1;
		int i = 0;

		while (i < this.alumnos.length && indiceEncontrado == -1) {
			if (this.alumnos[i].mismoLegajo(legajo)) {
				indiceEncontrado = i;
			} else {
				i++;
			}
		}
		return indiceEncontrado;
	}

}
