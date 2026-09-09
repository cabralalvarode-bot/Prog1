package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {

	public static void main(String[] args) {

		int betrag = readInteger("Bitte gewünschten Ausgabebetrag auf 5 Euro genau angeben: ");

		int[] scheine = { 200, 100, 50, 20, 10, 5 };

		for (int schein : scheine) {
			int anzahl = betrag / schein;
			betrag = betrag % schein;

			System.out.format("%3d-Euro Scheine: %d%n", schein, anzahl);
		}
	}
}
