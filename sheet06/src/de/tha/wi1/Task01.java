package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {

		// Beispiel-Array mit unregelmäßigen Dimensionen
		int[][][] data = { { { 1, 2, 3 }, { 4, 5 } }, { { 10 }, { 20, 30, 40 }, { 50 } },
				{ { 7, 8 }, {}, { 11, 12, 13, 14 } } };

		// Probar ambos metodos
		int maxFor = findMaxForLoop(data);
		int maxForEach = findMaxForEachLoop(data);

		System.out.println("Maximo (for traditional): " + maxFor);
		System.out.println("Maximo (for-each): " + maxForEach);
	}

	// a Usando bucles tradicionales con indices

	public static int findMaxForLoop(int[][][] a) {
		int max = Integer.MIN_VALUE; // menor numero posible para comparar.

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					if (a[i][j][k] > max) {
						max = a[i][j][k];
					}

				}

			}

		}
		return max;

	}

	// b Usando bucles for-each (sin indices)

	public static int findMaxForEachLoop(int[][][] a) {
		int max = Integer.MIN_VALUE;

		for (int[][] matrix : a) {
			for (int[] row : matrix) {
				for (int val : row) {
					if (val > max) {
						max = val;
					}

				}
			}

		}
		return max;
	}

}
