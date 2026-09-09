package de.tha.wi1;

public class Task02 {

	public static void main(String[] args) {

		int data[] = { 42, 87, 13, 65, 90, 22, 7, 54, 38, 62, 64, 31, 76, 48, 15, 70, 3, 81, 24, 93, 11, 60, 45, 57, 28,
				85, 17, 96, 2, 73, 33, 68, 9, 78, 50, 91, 19, 35, 4, 26, 8, 63, 47, 71, 52, 39, 4, 95, 23, 66, 88, 41,
				59, 12, 84, 18, 77, 25, 46, 69, 34, 53, 4, 98, 43, 10, 56, 20, 97, 16, 6, 75, 27, 40, 83, 21, 61, 49,
				32, 67, 14, 58, 29, 94, 1, 62, 5, 79, 36, 82, 37, 4, 44, 72, 92, 51, 55, 74, 86, 14 };

		// 1) Imprimir todos los valores (maximo 10 por linea)
		System.out.println("--- Array ---\n");
		System.out.println("a) ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();

		// 2) Minimo y Maximo
		int min = data[0];
		int max = data[0];
		double sum = 0;

		for (int val : data) {
			if (val < min) {
				min = val; // nuevo minimo
			}
			if (val > max) {
				max = val;
			}
			sum += val;
		}

		System.out.println("b)");
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println();

		// 3) Promedio (Mittelwert)
		double average = sum / data.length;
		System.out.println("c)");
		System.out.printf("Mittelwert: %.1f%n", average);
		System.out.println();

		// 4) Filtrar divisibles por 5
		// Paso a: Contar cuantos son divisibles por 5
		int countDiv5 = 0;
		for (int val : data) {
			if (val % 5 == 0) {
				countDiv5++;
			}
		}

		// Paso b) Crear nuevo array con el tamano exacto
		int[] div5Array = new int[countDiv5];

		// Paso c) Copiar los elementos manteniendo el orden
		int index = 0;
		for (int val : data) {
			if (val % 5 == 0) {
				div5Array[index] = val;
				index++;
			}
		}

		// Imprimir array filtrado
		System.out.println("Durch 5 teilbare Werte (Anzahl: " + countDiv5 + "):");
		for (int val : div5Array) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println();

		// 5) Modus (Numero mas frecuente y su frecuencia)
		int mode = data[0];
		int maxFrequency = 0;

		for (int i = 0; i < data.length; i++) {
			int currentCount = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[j] == data[i]) {
					currentCount++;
				}
			}
			if (currentCount > maxFrequency) {
				maxFrequency = currentCount;
				mode = data[i];
			}
		}
		System.out.println("Häufigste Zahl (Modus): " + mode + " (Häufigkeit: " + maxFrequency + ")");
	}
}
