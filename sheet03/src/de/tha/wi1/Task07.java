package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.util.Iterator;

public class Task07 {

	public static void main(String[] args) {

		int h = readInteger("Altura del arbol: ");

		for (int i = 0; i < h; i++) {

			for (int j = 0; j < h - 1 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int j = 0; j < h - 1; j++) {
			System.out.print(" ");
		}
		System.out.println("#");

	}
}
