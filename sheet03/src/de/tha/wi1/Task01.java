package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task01 {

	public static void main(String[] args) {

		String word = readWord("Geben Sie ein Wort ein: ").toLowerCase();

		boolean compareWithOperator = (word == "programmieren");
		System.out.println("Vergleich mit ’==’: " + compareWithOperator);

		boolean compareWithEquals = word.equals("programmieren");
		System.out.println("Vergleich mit ’.equals()’: " + compareWithEquals);

	}

}
