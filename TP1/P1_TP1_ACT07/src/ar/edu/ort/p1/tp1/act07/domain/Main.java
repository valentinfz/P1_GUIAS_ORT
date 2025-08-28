package ar.edu.ort.p1.tp1.act07.domain;

import ar.edu.ort.p1.tp1.act07.classes.FiguraCircunferencia;
import ar.edu.ort.p1.tp1.act07.classes.FiguraRectangulo;
import ar.edu.ort.p1.tp1.act07.classes.FiguraTrianguloEquilatero;
import ar.edu.ort.p1.tp1.act07.classes.GrupoDeFiguras;

public class Main {
	public static void main(String[] args) {
		GrupoDeFiguras grupo = new GrupoDeFiguras();

		// Crear cada figura y guardarla en una variable
		FiguraCircunferencia c1 = new FiguraCircunferencia("Rojo", 2);
		FiguraRectangulo r1 = new FiguraRectangulo("Azul", 3, 4);
		FiguraTrianguloEquilatero t1 = new FiguraTrianguloEquilatero("Verde", 5);

		// Agregarlas al grupo
		grupo.agregarFigura(c1);
		grupo.agregarFigura(r1);
		grupo.agregarFigura(t1);

		// Mostrar cada figura
		grupo.mostrarFiguras();

		// Mostrar área y perímetro total
		System.out.println("Área total: " + grupo.areaTotal());
		System.out.println("Perímetro total: " + grupo.perimetroTotal());
	}
}
