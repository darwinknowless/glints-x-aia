package com.online.array;

// block class
public class ContohArray {

	// method main
	public static void main(String[] args) {

		// create array
		String[] nama = { "Deni", "Doni", "Dino", "Dono" };

		// block looping "FOR"
		// attribute "length" : panjang array dari variable "nama"
		for (int i = 0; i < nama.length; i++) {

			// print result
			System.out.println("Indeks ke-" + i + ": " + nama[i]);

		}
	}
}
