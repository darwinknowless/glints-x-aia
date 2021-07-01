package com.online.perulanganforeach;

//block class
public class PerulanganForEach {
	// method
	public static void main(String[] args) {
		// create array
		int angka[] = { 3, 1, 42, 24, 12 };

		// block for each
		for (int x : angka) {
			System.out.print(x + " ");
		}
	}
}
