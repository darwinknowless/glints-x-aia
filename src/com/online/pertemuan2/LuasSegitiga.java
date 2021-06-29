// Declare package
package com.online.pertemuan2;

//Import library
import java.util.Scanner;

//Block class
public class LuasSegitiga {
	// Method main()
	public static void main(String[] args) {

		// Deklarasi variabel
		Double luas;
		int alas, tinggi;

		// Membuat scanner baru
		Scanner baca = new Scanner(System.in);

		// Input
		System.out.println("== Program Hitung Luas Segitiga ==");
		System.out.print("Input alas: ");
		alas = baca.nextInt();
		System.out.print("Input tinggi: ");
		tinggi = baca.nextInt();

		// Proses
		luas = Double.valueOf((alas * tinggi) / 2);

		// Output
		System.out.println("Luas = " + luas);
	}
}
// KONVERSI TYPE DATA
/*
 * Variabel luas bertipe data Double, berarti nilai yang bisa disimpan adalah
 * Double. Sedangkan variabel alas dan tinggi bertipe Integer. Agar hasil
 * operasi data integer dapat disimpan dalam variabel bertipe double, maka perlu
 * dikonversi.
 */
