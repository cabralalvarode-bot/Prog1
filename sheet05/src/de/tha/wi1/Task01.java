package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {

		int[] rnd = { 17, 83, 64, 5, 90, 48, 71, 3, 27, 66, 14, 95, 9, 56, 78, 22, 60, 99, 2, 31 };

		System.out.print("Schritt 0: ");
		printArray(rnd);

		// Selection Sort
		for (int i = 0; i < rnd.length; i++) {

			// 1) Buscar indice menor
			int minIndex = i;
			for (int j = i + 1; j < rnd.length; j++) {
				if (rnd[j] < rnd[minIndex]) {
					minIndex = j;
				}
			}

			// 2) Intercambiar (swap) el valor minimo con la posicion i
			int temp = rnd[minIndex];
			rnd[minIndex] = rnd[i];
			rnd[i] = temp;
			// 3) Imprimir el estado actual del arreglo en cada paso
			System.out.format("Schritt %d: ", (i + 1));
			printArray(rnd);

		}

		// Imprimir resultado final
		System.out.print("Sortiert: ");
		printArray(rnd);
	}

	// Metodo auxiliar para imprimir los elementos del arreglo
	public static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}

		System.out.println();

	}
}
