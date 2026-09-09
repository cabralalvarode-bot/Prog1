package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task01 {

	public static void main(String[] args) {

		int day = readInteger("Geben Sie den Tag ein: ");
		int month = readInteger("Geben Sie den Monat ein: ");
		int year = readInteger("Geben Sie das Jahr ein: ");

		// Ajuste de Zeller para enero y febrero
		int m = month;
		int y = year;

		if (m <= 2) {
			m += 12;
			y -= 1;
		}

		int k = y % 100; // dos ultimos digitos del ano
		int j = y / 100; // dos primeros digitos del ano

		// Formula ajustada para que 0 = Lunes, 1 = Martes ... 6 = Domingo
		int h = (day + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j) + 5) % 7;

		// Arreglo en orden natural (Lunes a Domingo)
		String[] wochentage = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };

		System.out.format("Der %02d.%02d.%d war ein %s.%n", day, month, year, wochentage[h]);

	}

}
