package ar.edu.ort.p1.tp2.opcionales.classes;

public class UtilArrays {

	public static void mostrarSinRepetidos(char[] elementos) {
		char[] elementosUnicos = new char[elementos.length];
		int indiceUnico = 0;

		for (char elemento : elementos) {
			indiceUnico = agregarSinDuplicado(elemento, elementosUnicos, indiceUnico);
		}
		mostrar(elementosUnicos);
	}

	public static void invertir(char[] elementos) {
		int izquierda = 0;
		int derecha = elementos.length - 1;
		char temp;

		while (izquierda < derecha) {
			temp = elementos[izquierda];
			elementos[izquierda] = elementos[derecha];
			elementos[derecha] = temp;
			izquierda++;
			derecha--;
		}
	}

	public static void rotar1(char[] elementos) {
		char ultimo = elementos[elementos.length - 1];

		for (int i = elementos.length - 1; i > 0; i--) {
			elementos[i] = elementos[i - 1];
		}
		elementos[0] = ultimo;
	}

	public static void mostrarUnion(char[] cjto1, char[] cjto2) {
		char[] elementosUnion = new char[cjto1.length + cjto2.length];
		int indiceUnion = 0;

		indiceUnion = agregarElementosUnicos(cjto1, elementosUnion, indiceUnion);
		indiceUnion = agregarElementosUnicos(cjto2, elementosUnion, indiceUnion);

		mostrar(elementosUnion);
	}

	public static void mostrarInterseccion(char[] cjto1, char[] cjto2) {
		char[] elementosInterseccion = new char[Math.min(cjto1.length, cjto2.length)];
		int indice = 0;

		for (char actual : cjto1) {
			if (existeElemento(actual, cjto2) && !existeElemento(actual, elementosInterseccion)) {
				elementosInterseccion[indice] = actual;
				indice++;
			}
		}
		mostrar(elementosInterseccion);
	}

	public static void mostrarDiferencia(char[] cjto1, char[] cjto2) {
		char[] elementosDiferencia = new char[cjto1.length];
		int indiceDiferencia = 0;

		for (char actual : cjto1) {
			indiceDiferencia = agregarSiNoExiste(actual, cjto2, elementosDiferencia, indiceDiferencia);
		}
		mostrar(elementosDiferencia);
	}

	public static void mostrarDiferenciaSimetrica(char[] cjto1, char[] cjto2) {
		char[] diferencia1 = obtenerDiferencia(cjto1, cjto2);
		char[] diferencia2 = obtenerDiferencia(cjto2, cjto1);
		char[] diffSimetrica = new char[diferencia1.length + diferencia2.length];
		int indiceSimetrica = 0;

		indiceSimetrica = agregarElementosUnicos(diferencia1, diffSimetrica, indiceSimetrica);
		indiceSimetrica = agregarElementosUnicos(diferencia2, diffSimetrica, indiceSimetrica);

		mostrar(diffSimetrica);
	}

	public static void mostrar(char[] elementos) {
		if (elementos != null) {
			for (int i = 0; i < elementos.length; i++) {
				char elemento = elementos[i];
				if (esElementoValido(elemento)) {
					System.out.print(elemento + " ");
				}
			}
		}
	}

	public static boolean esPalindromo(char[] elementos) {
		boolean esPalindromo = true;
		int izquierda = 0;
		int derecha = elementos.length - 1;

		while (izquierda < derecha && esPalindromo) {
			if (elementos[izquierda] != elementos[derecha]) {
				esPalindromo = false;
			}
			izquierda++;
			derecha--;
		}
		return esPalindromo;
	}

	private static boolean existeElemento(char elemento, char[] elementosUnicos) {
		return buscarElemento(elemento, elementosUnicos) != '\0';
	}

	private static boolean esElementoValido(char elemento) {
		return elemento != '\0';
	}

	private static char buscarElemento(char elementoBuscado, char[] elementosUnicos) {
		char elementoEncontrado = '\0';
		char elementoActual;
		int i = 0;

		while (i < elementosUnicos.length && elementoEncontrado == '\0') {
			elementoActual = elementosUnicos[i];
			if (elementoActual == elementoBuscado) {
				elementoEncontrado = elementoActual;
			} else {
				i++;
			}
		}
		return elementoEncontrado;
	}

	private static int agregarElementosUnicos(char[] origen, char[] destino, int indiceDestino) {
		boolean existe;

		if (origen != null) {
			for (int i = 0; i < origen.length; i++) {
				char elemento = origen[i];

				if (esElementoValido(elemento)) {
					existe = existeElemento(elemento, destino);
					if (!existe) {
						destino[indiceDestino] = elemento;
						indiceDestino++;
					}
				}
			}
		}
		return indiceDestino;
	}

	private static int agregarSiNoExiste(char elemento, char[] referencia, char[] destino, int indiceDestino) {
		if (!existeElemento(elemento, referencia) && !existeElemento(elemento, destino)) {
			destino[indiceDestino] = elemento;
			indiceDestino++;
		}
		return indiceDestino;
	}

	private static int agregarSinDuplicado(char elemento, char[] destino, int indiceDestino) {
		boolean existe = existeElemento(elemento, destino);

		if (esElementoValido(elemento) && !existe) {
			destino[indiceDestino] = elemento;
			indiceDestino++;
		}

		return indiceDestino;
	}

	private static char[] obtenerDiferencia(char[] cjto1, char[] cjto2) {
		char[] diferencia = new char[cjto1.length];
		int indiceDiferencia = 0;

		for (char actual : cjto1) {
			indiceDiferencia = agregarSiNoExiste(actual, cjto2, diferencia, indiceDiferencia);
		}
		return diferencia;
	}

}
