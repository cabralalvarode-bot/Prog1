package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {

		int x = readInteger("Geben Sie eine Ganzzahl >= 0 ein: ");

		// 1) While (avanza de 2 en 2)
		int sumWhile = 0;
		int i = 0;

		while (i <= x) {
			sumWhile += i; // Sume ’i’ a ’sumWhile’
			i += 2; // Pasa al siguiente numero par
		}
		System.out.println("sumWhile: " + sumWhile);

		// 2) do-while
		int sumDoWhile = 0;
		int j = 0;

		do {
			sumDoWhile += j;
			j += 2;
		} while (j <= x);
		System.out.println("sumDoWhile: " + sumDoWhile);

		// 3) for
		int sumFor = 0;

		for (int k = 0; k <= x; k += 2) {
			sumFor += k;
		}
		System.out.println("sumFor: " + sumFor);

	}
}
