package com.online.perulanganwhile;

//import library
import java.util.Scanner;

//block class
public class PerulanganWhile {
	// method
	public static void main(String[] args) {

		// create var & scanner
		boolean running = true;
		int counter = 0;
		String jawab;
		Scanner scan = new Scanner(System.in);

		// block while loop
		while (running) {
			System.out.println("Apakah anda ingin keluar?");
			System.out.print("Jawab [ya/tidak]> ");

			jawab = scan.nextLine();

			// cek jawabnnya, kalau ya maka berhenti mengulang
			if (jawab.equalsIgnoreCase("ya")) {
				running = false;
			}

			counter++;
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
	}
}
