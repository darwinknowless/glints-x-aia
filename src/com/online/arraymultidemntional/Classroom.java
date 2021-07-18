package com.online.arraymultidemntional;

// import library
import java.util.Scanner;

// block class
public class Classroom {

	// method main
	public static void main(String[] args) {

		// create array & scanner
		String[][] table = new String[2][3];
		Scanner scan = new Scanner(System.in);

		// for loop "fill each table"
		// NOTE: Bar (Row), Column (Seat)
		for (int bar = 0; bar < table.length; bar++) {
			for (int col = 0; col < table[bar].length; col++) {
				System.out.format("Who will sit at the table (%d,%d): ", bar, col);
				// input data
				table[bar][col] = scan.nextLine();
			}
		}

		// display array contents
		// NOTE: Bar (Row), Column (Seat)
		System.out.println("-------------------------");
		for (int bar = 0; bar < table.length; bar++) {
			for (int col = 0; col < table[bar].length; col++) {
				System.out.format("| %s | \t", table[bar][col]);
			}
			System.out.println("");
		}
		System.out.println("-------------------------");

	}

}
