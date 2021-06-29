package com.online.operator;

//Import library
import java.util.Scanner;

// Block class
public class OperatorAritmatika {
	// Method main()
	public static void main(String[] args) {
		// Declare variable
		int angka1, angka2, hasil;

		// Create new Scanner
		Scanner keyboard = new Scanner(System.in);

		// 1.
		// Input
		System.out.print("Input angka-1: ");
		angka1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		angka2 = keyboard.nextInt();
		// Penjumlahan
		hasil = angka1 + angka2;
		System.out.println("Hasil = " + hasil);

		// 2.
		// Input
		System.out.print("Input angka-1: ");
		angka1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		angka2 = keyboard.nextInt();
		// Pengurangan
		hasil = angka1 - angka2;
		System.out.println("Hasil = " + hasil);

		// 3.
		// Input
		System.out.print("Input angka-1: ");
		angka1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		angka2 = keyboard.nextInt();
		// Perkalian
		hasil = angka1 * angka2;
		System.out.println("Hasil = " + hasil);

		// 4.
		// Input
		System.out.print("Input angka-1: ");
		angka1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		angka2 = keyboard.nextInt();
		// Pembagian
		hasil = angka1 / angka2;
		System.out.println("Hasil = " + hasil);

		// 5.
		// Input
		System.out.print("Input angka-1: ");
		angka1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		angka2 = keyboard.nextInt();
		// Sisa bagi
		hasil = angka1 % angka2;
		System.out.println("Hasil = " + hasil);
	}

}
