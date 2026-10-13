package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {
		
		//a
		float nettoPreis = readFloat("Geben Sie den Netto-Preis ein: ");
		System.out.format("Eingegebener Netto-Preis: %2.f\n", nettoPreis);
		
		//b
		
		float brutto19Preis = 0.0f; 
		float brutto7Preis = 0.0f; 
		
		System.out.format("Preis mit 19%% MwSt: ", brutto19Preis);
		System.out.format("Preis mit 7%% MwSt: ", brutto7Preis);
		
		//c
        float nettoCent = Math.round(nettoPreis * 100);
       
		float brutto19Cent = Math.round(nettoCent * 1.19f);
        float brutto7Cent = Math.round(nettoCent * 1.07f);

		float euro19 = brutto19Cent / 100; 
		float cent19 = brutto19Cent % 100; 
		float euro7 = brutto7Cent / 100; 
		float cent7 = brutto7Cent % 100; 

		System.out.format("%d.%02d", brutto19Cent, brutto7Cent);

		
		
		
	}
	
}
