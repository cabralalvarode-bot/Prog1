package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task06 {

	public static void main(String[] args) {

		int number = readInteger("Bitte Zahl eingeben: ");
		int quersumme = 0;

		// Guardar el numero en una variable auxiliar para ir reduciendolo
		int temp = number;

		while (temp > 0) {
			// 1) Obtener el ultimo digito usando modulo (%10)
			int lastDigit = temp % 10;

			// 2) Sumamos el digito a nuestro acumulador
			quersumme += lastDigit;

			// 3) Eliminamos el ultimo digito mendiante division entera (/10)

			temp = temp / 10;
		}

		System.out.println("Die Quersumme ist: " + quersumme);

	}

}
