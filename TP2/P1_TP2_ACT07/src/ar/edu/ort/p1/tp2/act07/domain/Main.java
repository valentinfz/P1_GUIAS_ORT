package ar.edu.ort.p1.tp2.act07.domain;

import ar.edu.ort.p1.tp2.act07.classes.Alumno;
import ar.edu.ort.p1.tp2.act07.classes.Comision;

public class Main {

	public static void main(String[] args) {

		// ==============================
		// 1️⃣ Crear alumnos
		// ==============================
		Alumno[] alumnos = { new Alumno("A01", "Gomez", 20), new Alumno("A02", "Perez", 22),
				new Alumno("A03", "Lopez", 21) };

		// ==============================
		// 2️⃣ Crear comision
		// ==============================
		int CANT_CLASES = 6;
		Comision comision = new Comision("1A", alumnos, CANT_CLASES);

		// ==============================
		// 3️⃣ Registrar asistencias
		// ==============================
		// Estados válidos: 'P' = Presente, 'A' = Ausente, 'T' = Tarde

		// Alumno Gomez
		comision.registrarAsistencia("A01", 0, 'P');
		comision.registrarAsistencia("A01", 1, 'T');
		comision.registrarAsistencia("A01", 2, 'P');
		comision.registrarAsistencia("A01", 3, 'A');
		comision.registrarAsistencia("A01", 4, 'P');
		comision.registrarAsistencia("A01", 5, 'P');

		// Alumno Perez
		comision.registrarAsistencia("A02", 0, 'A');
		comision.registrarAsistencia("A02", 1, 'A');
		comision.registrarAsistencia("A02", 2, 'P');
		comision.registrarAsistencia("A02", 3, 'A');
		comision.registrarAsistencia("A02", 4, 'T');
		comision.registrarAsistencia("A02", 5, 'A');

		// Alumno Lopez
		comision.registrarAsistencia("A03", 0, 'P');
		comision.registrarAsistencia("A03", 1, 'P');
		comision.registrarAsistencia("A03", 2, 'P');
		comision.registrarAsistencia("A03", 3, 'P');
		comision.registrarAsistencia("A03", 4, 'P');
		comision.registrarAsistencia("A03", 5, 'P');

		// ==============================
		// 4️⃣ Mostrar asistencias globales
		// ==============================
		System.out.println("\n=== Asistencias globales ===");
		comision.obtenerAsistenciasGlobales();

		// ==============================
		// 5️⃣ Alumnos aptos (>= 75%)
		// ==============================
		System.out.println("\n=== Alumnos aptos ===");
		comision.mostrarAlumnosAptos();

		// ==============================
		// 6️⃣ Alumnos que dejaron la cursada (>4 ausencias seguidas)
		// ==============================
		System.out.println("\n=== Alumnos que dejaron la cursada ===");
		comision.alumnosQueDejaronLaCursada();

		// ==============================
		// 7️⃣ Cantidad total de llegadas tarde
		// ==============================
		System.out.println("\n=== Cantidad de llegadas tarde ===");
		System.out.println(comision.cantidadLlegadasTarde());

		// ==============================
		// 8️⃣ Clases con asistencia perfecta
		// ==============================
		System.out.println("\n=== Clases con asistencia perfecta ===");
		System.out.println(comision.cantidadClasesAsistenciaPerfecta());

		// ==============================
		// 9️⃣ Porcentaje de presentismo por clase
		// ==============================
		System.out.println("\n=== Porcentaje de presentismo por clase ===");
		double[] porcentajes = comision.obtenerPorcentajeDePresentismo();
		for (int i = 0; i < porcentajes.length; i++) {
			System.out.println("Clase " + (i + 1) + ": " + porcentajes[i] + "%");
		}
	}
}
