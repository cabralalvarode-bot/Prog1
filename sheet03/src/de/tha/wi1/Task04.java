package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task04 {

	public static void main(String[] args) {

		int n = readInteger("Geben Sie eine Ganzzahl >= 0 ein: ");

		// 1) While
		long facultyWhile = 1;
		int i = 1;

		while (i <= n) {
			facultyWhile = facultyWhile * i; // Multiplica acumulativamente: facultyWhile = facultyWhile * i
			i++;
		}
		System.out.println("facultyWhile: " + n + "! = " + facultyWhile);

		// 2) do-while
		long facultyDoWhile = 1;
		int j = 1;

		if (n > 0) { // Garantiza que funcione correctamente cuando n = 0
			do {
				facultyDoWhile *= j;
				j++;
			} while (j <= n);
		}
		System.out.println("facultyDoWhile: " + n + "! = " + facultyDoWhile);

		// 3) for
		long facultyFor = 1;
		for (int k = 1; k <= n; k++) {
			facultyFor *= k;
		}
		System.out.println("facultyFor: " + n + "! = " + facultyFor);

	}
}
