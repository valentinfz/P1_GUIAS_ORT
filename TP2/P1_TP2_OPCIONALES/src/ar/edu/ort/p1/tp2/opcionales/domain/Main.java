package ar.edu.ort.p1.tp2.opcionales.domain;

import ar.edu.ort.p1.tp2.opcionales.classes.UtilArrays;

public class Main {

	public static void main(String[] args) {

		// ===========================
		// 11) Mostrar sin repetidos
		// ===========================
		System.out.println("=== Ejercicio 11 ===");
		char[] e11 = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };
		UtilArrays.mostrarSinRepetidos(e11); // Debe mostrar: INMET
		System.out.println("\n");

		// ===========================
		// 12) Es palíndromo
		// ===========================
		System.out.println("=== Ejercicio 12 ===");
		char[] e12a = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' }; // false
		char[] e12b = { 'R', 'E', 'C', 'O', 'N', 'O', 'C', 'E', 'R' }; // true
		System.out.println("INMINENTE -> " + UtilArrays.esPalindromo(e12a));
		System.out.println("RECONOCER -> " + UtilArrays.esPalindromo(e12b));
		System.out.println();

		// ===========================
		// 13) Invertir
		// ===========================
		System.out.println("=== Ejercicio 13 ===");
		char[] e13 = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };
		System.out.print("Original: ");
		UtilArrays.mostrar(e13);
		UtilArrays.invertir(e13); // ETNENIMNI
		System.out.print(" -> Invertida: ");
		UtilArrays.mostrar(e13);
		System.out.println("\n");

		// ===========================
		// 14) Rotar 1 posición
		// ===========================
		System.out.println("=== Ejercicio 14 ===");
		char[] e14 = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };
		System.out.print("Original: ");
		UtilArrays.mostrar(e14);
		UtilArrays.rotar1(e14); // EINMINENT
		System.out.print(" -> Rotada: ");
		UtilArrays.mostrar(e14);
		System.out.println("\n");

		// ===========================
		// 15) Unión
		// ===========================
		System.out.println("=== Ejercicio 15 ===");
		char[] e15a = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char[] e15b = { 'S', 'A', 'L', 'M', 'O', 'N' };
		UtilArrays.mostrarUnion(e15a, e15b); // BLANCOSM
		System.out.println("\n");

		// ===========================
		// 16) Intersección
		// ===========================
		System.out.println("=== Ejercicio 16 ===");
		UtilArrays.mostrarInterseccion(e15a, e15b); // LANO
		System.out.println("\n");

		// ===========================
		// 17) Diferencia
		// ===========================
		System.out.println("=== Ejercicio 17 ===");
		UtilArrays.mostrarDiferencia(e15a, e15b); // BC
		System.out.println("\n");

		// ===========================
		// 18) Diferencia Simétrica
		// ===========================
		System.out.println("=== Ejercicio 18 ===");
		UtilArrays.mostrarDiferenciaSimetrica(e15a, e15b); // BCSM
	}
}