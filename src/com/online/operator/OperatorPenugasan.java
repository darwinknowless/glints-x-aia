package com.online.operator;

// Block Class
public class OperatorPenugasan {
	// Method main()
	public static void main(String[] args) {
		// Declare variable
		int a, b;

		// input value
		a = 5;
		b = 10;

		// 1.
		// Penambahan
		b += a;
		// now b = 15
		System.out.println("Penambahan : " + b);

		// 2.
		// Pengurangan
		b -= a;
		// now b = 10 (kerena 15 - 5)
		System.out.println("Pengurangan : " + b);

		// 3.
		// Perkalian
		b *= a;
		// now b = 50 (karena 10 * 5)
		System.out.println("Perkalian : " + b);

		// 4.
		// Pembagian
		b /= a;
		// now b = 10
		System.out.println("Pembagian : " + b);

		// 5.
		// Sisa bagi
		b %= a;
		// now b = 0 (karena 10 % 5 adalah 0)
		System.out.println("Sisa bagi : " + b);

	}

}
