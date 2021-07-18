package com.online.array;

// import library
import java.util.Scanner;

// block class
public class FruitsArray {
	// method main
	public static void main(String[] args) {

		// create array of fruits
		String[] fruits = new String[5];

		// create scanner
		Scanner scan = new Scanner(System.in);

		// function input data to array with for loop for each
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("Buah ke-" + i + ": ");
			// input data here
			fruits[i] = scan.nextLine();
		}

		System.out.println("---------------------------");

		// show array
		for (String b : fruits) {
			System.out.println(b);
		}
	}

}

// result
/*
 * Buah ke-0: Apple Buah ke-1: Grapes Buah ke-2: Banana Buah ke-3: Water Melon
 * Buah ke-4: Orange --------------------------- Apple Grapes Banana Water Melon
 * Orange
 */
