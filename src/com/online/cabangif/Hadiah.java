package com.online.cabangif;

// import library
import java.util.Scanner;

//block class
public class Hadiah {
	// method
	public static void main(String[] args) {
		// membuat variable & scanner
		int belanja = 0;
		Scanner scan = new Scanner(System.in);

		// mengambil imput
		System.out.print("Total Belanjaan: Rp ");
		belanja = scan.nextInt();

		// cek, apakah belanjaan diatas Rp. 100.00
		if (belanja > 100000) {
			System.out.println("Selamat, anda mendapatkan hadiah!");
		}
		System.out.println("Terima kasih...");
	}
}

// OUTPUT1
// Total Belanjaan: Rp 120000
// Selamat, anda mendapatkan hadiah!
// Terima kasih...

//OUTPUT1
//Total Belanjaan: Rp 100000
//Terima kasih...
