package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {

	public static void main(String[] args) {
		
		String form = readWord("if-else Geben Sie eine Form ein: ");

		double flaeche = 0.0;
		
		// if - else

		if (form.equals("Kreis")) {
			double r = readDouble("Kantenlängen des Radius: ");
			flaeche = Math.PI * r * r;
			System.out.printf("Die Fläche betrag: %.2f %n", flaeche);

		} else if (form.equals("Rechteck")) {
			double seiteA = readDouble("Seite A: ");
			double seiteB = readDouble("Seite B: ");
			flaeche = seiteA * seiteB;
			System.out.printf("Die Fläche beträgt %.2f %n", flaeche);

		} else if (form.equals("Quadrat")) {
			double a = readDouble("Kantenlänge des Quadrats: ");
			flaeche = a * a;
			System.out.printf("Die Fläche beträgt %.2f %n", flaeche);

		} else if (form.equals("Dreieck")) {
			double grundSeite = readDouble("Grundseite: ");
			double hoehe = readDouble("Höhe: ");
			flaeche = (grundSeite * hoehe) / 2.0;
			System.out.println("Die Fläche beträgt " + flaeche);
		} else {
			System.err.println("Unbekannte Form");
		}

		// b) swicht-case

		String form2 = readWord("switch-case Geben Sie eine Form an:");

		switch (form2) {
		case "Kreis":
			double r = readDouble("Radius: ");
			flaeche = Math.PI * r * r;
			System.out.printf("Die Fläche beträgt: %.2f%n", flaeche);
            break;
            
		case "Rechteck":
			double seiteA = readDouble("Kantenlänge des A: ");
			double seiteB = readDouble("Kantenlänge des B:");
			flaeche = seiteA * seiteB;
			System.out.printf("Die Fläche beträgt: %.2f%n", flaeche);
            break;
            
		case "Quadrat":
			double a = readDouble("Kantenlänge des Quadrat: ");
			flaeche = a * a; 
			System.out.printf("Die Fläche betragt : %.2f%n" , flaeche);
            break;
            
		case "Dreieck":
			double grundSeite = readDouble("Kantenlänge der Grundseite: ");
			double hoehe = readDouble("Kantenlänge der Höhe: "); 
			System.out.printf("Die Fläche beträgt %.2f%n" , flaeche);
			break;
			
		default:
			System.err.println("Ungueltige Eingabe");
		}
		
	}

}
