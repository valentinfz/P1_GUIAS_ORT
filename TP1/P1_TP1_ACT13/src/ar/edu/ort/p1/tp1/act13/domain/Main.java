package ar.edu.ort.p1.tp1.act13.domain;

import ar.edu.ort.p1.tp1.act13.classes.FuenteMarcado;
import ar.edu.ort.p1.tp1.act13.classes.FuenteProgramacion;
import ar.edu.ort.p1.tp1.act13.classes.Metodo;
import ar.edu.ort.p1.tp1.act13.classes.Programa;
import ar.edu.ort.p1.tp1.act13.classes.Sophie;

public class Main {
	public static void main(String[] args) {

		// ---------- Métodos ----------
		Metodo m1 = new Metodo("login", 2, 10, 1);
		Metodo m2 = new Metodo("logout", 0, 5, 0);
		Metodo m3 = new Metodo("renderHTML", 1, 20, 2);

		// ---------- Fuentes ----------
		FuenteProgramacion fuenteJava = new FuenteProgramacion("Main.java", "/src");
		FuenteProgramacion fuenteJs = new FuenteProgramacion("App.js", "/src");
		FuenteMarcado fuenteHtml = new FuenteMarcado("index.html", "/web", 10);

		// ---------- Los agrego ----------
		fuenteJava.agregarMetodo(m1);
		fuenteJava.agregarMetodo(m2);
		fuenteJs.agregarMetodo(m3);

		// ---------- Programa 1 ----------
		Programa prog1 = new Programa("P1", "SistemaLogin", "Valen", true);
		prog1.agregarFuente(fuenteJava);
		prog1.agregarFuente(fuenteHtml);

		// ---------- Programa 2 ----------
		Programa prog2 = new Programa("P2", "WebApp", "Sofi", false); // no pasa pruebas
		prog2.agregarFuente(fuenteJs);

		// ---------- Sophie ----------
		Sophie sophie = new Sophie();
		sophie.agregarPrograma(prog1);
		sophie.agregarPrograma(prog2);

		// ========== PRUEBAS ==========
		System.out.println("Índice calidad Programa 1: " + prog1.calcularIndiceCalidad());
		System.out.println("Índice calidad Programa 2: " + prog2.calcularIndiceCalidad());

		// Programas debajo de cierto umbral
		System.out.println("\nProgramas debajo del umbral 10:");
		sophie.mostrarProgramasPorDebajoDe(10);

		// Buscar detalle de un método
		System.out.println("\nDetalle del método 'login' en Programa 1:");
		prog1.mostrarDetalleDeMetodo("login");

		System.out.println("\nDetalle del método 'noExiste' en Programa 1:");
		prog1.mostrarDetalleDeMetodo("noExiste");

		// Fuentes mayores al promedio
		System.out.println("\nFuentes mayores al promedio en Programa 1:");
		prog1.mostrarListadoFuentesMayoresAlPromedio();
	}
}