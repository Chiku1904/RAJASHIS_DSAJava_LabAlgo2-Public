package com.greatlearning.lab2_ii;

public class NoteCount {

	public void counting(int[] currency, int amount) {

		int noteCount[] = new int[currency.length];
		
		int sumOfNotes = 0;
		for (int i = 0; i < currency.length; i++) {
			noteCount[i] = amount / currency[i];
			amount = amount % currency[i];
			sumOfNotes += noteCount[i];
		}

		System.out.println("\nNotes & No.s");
		System.out.println("-------------");
		for (int j = 0; j < currency.length; j++) {
			if (noteCount[j] != 0) {
				System.out.println(currency[j] + " X " + noteCount[j]);
			}
		}

		System.out.println("---------------");
		System.out.println("Total Notes: " + sumOfNotes);

	}

}
