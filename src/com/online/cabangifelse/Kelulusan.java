package com.online.cabangifelse;

//import library
import java.util.Scanner;

//block class
public class Kelulusan {
	// method
	public static void main(String[] args) {
		// mebuat var & scanner
		int nilai;
		String nama;
		Scanner scan = new Scanner(System.in);

		// mengambil input
		System.out.print("Nama: ");
		nama = scan.nextLine();
		System.out.print("Nilai: ");
		nilai = scan.nextInt();

		// cek apakah lulus/tidak
		if (nilai >= 70) {
			System.out.println("Selamat " + nama + ", anda lulus!");
		} else {
			System.out.println("Maaf " + nama + ", anda tidak lulus!");
		}
	}
}
//
// OUTPUT1
// Nama: Darwin
// Nilai: 60
// Maaf Darwin, anda tidak lulus
//
// OUTPUT2
// Nama: Darwin
// Nilai: 90
// Selamat Darwin, anda lulus!
