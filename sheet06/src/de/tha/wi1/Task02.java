package de.tha.wi1;

public class Task02 {

	public static void main(String[] args) {
		// c) Pruebas con los ejemplos del enunciado
		int[] allValues = { 1, 3, 5, 7, 9, 11 };
		int[] check1 = { 3, 7, 9 };
		int[] check2 = { 2, 3, 7 };

		System.out.println("Check 1 esta contenido: " + arrayContains(allValues, check1)); // Imprime: true
		System.out.println("Check 2 esta contenido: " + arrayContains(allValues, check2)); // Imprime: false

		// Pruebas adicionales con los casos borde (Hinweise)
		int[] emptyArray = {};
		System.out.println("Primer arreglo vacio: " + arrayContains(emptyArray, check1)); // Imprime: false
		System.out.println("Segundo arreglo vacio: " + arrayContains(allValues, emptyArray)); // Imprime: true
	}

	// (a) y (b) Implementación de la firma y el cuerpo del método
	public static boolean arrayContains(int[] allValues, int[] check) {

		// Regla 2: Si el primer arreglo está vacío, el resultado es false
		if (allValues.length == 0) {
			return false;
		}

		// Regla 3: Si el segundo arreglo está vacío (y el primero no), el resultado es
		// true
		if (check.length == 0) {
			return true;
		}

		// Regla 1: Verificar que cada elemento de 'check' esté en 'allValues'
		for (int valueToCheck : check) {
			boolean found = false;

			// Buscamos 'valueToCheck' dentro de 'allValues'
			for (int val : allValues) {
				if (val == valueToCheck) {
					found = true;
					break; // Ya lo encontramos, no hace falta seguir buscando este número
				}
			}

			// Si no se encontró este elemento, entonces todo el conjunto falla
			if (!found) {
				return false;
			}
		}

		// Si todos los elementos del segundo arreglo fueron encontrados
		return true;
	}
}
