package com.online.cabangnestedif;

//import
import java.util.Scanner;

//block class
public class Kasir {
	// method
	public static void main(String[] args) {
		// deklarasi variabel dan Scanner
		int belanjaan, diskon, bayar;
		String kartu;
		Scanner scan = new Scanner(System.in);

		// mengambil input
		System.out.print("Apakah ada kartu member: ");
		kartu = scan.nextLine();
		System.out.print("Total belanjaan: ");
		belanjaan = scan.nextInt();

		// proses
		// equalsIsIgnoreCase("ya") : digunakan untuk membandingkan String dengan tidak
		// memperdulikan huruf besar dan kecilnya.
		// equals : fungsinya sama. Tapi equals() akan memperhatikan case hurufnya.
		if (kartu.equalsIgnoreCase("ya")) {
			if (belanjaan > 500000) {
				diskon = 50000;
			} else if (belanjaan > 100000) {
				diskon = 15000;
			} else {
				diskon = 0;
			}

		} else {
			if (belanjaan > 100000) {
				diskon = 5000;
			} else {
				diskon = 0;
			}
		}

		// total yang harus dibayar
		bayar = belanjaan - diskon;

		// output
		System.out.println("Total Bayar: Rp " + bayar);
	}
}
