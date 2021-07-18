package com.online.arraymultidemntional;

// block class
public class ContohArray2D {

	// method main
	public static void main(String[] args) {

		// create array
		String[][] contacts = { { "Darwin", "085750000049" }, { "Knowless", "089680000049" },
				{ "DK", "085156310749" } };

		// for loop
		for (int x = 0; x < contacts.length; x++) {
			System.out.println("Name: " + contacts[x][0]);
			System.out.println("Mobile: " + contacts[x][1]);
			System.out.println("-------------------------");
		}
	}
}
