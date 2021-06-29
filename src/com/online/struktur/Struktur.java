// STRUKTUR DASAR PROGRAM JAVA

// 1. DEKLARASI PACKAGE
/*
 * Package merupakan sebuah folder yang berisi sekumpulan program Java.
 * Deklarasi package biasanya dilakukan saat membuat program atau aplikasi besar.
 * Biasanya nama package mengikuti nama domain dari sebauh vendor yang mengeluarkan program tersebut.
 * 
 * Contoh
 * 
 * "package com.darwin.program"
 * 
 * Contoh diatas merupakan nama domain dari "darwin.com"
 * Aturannya: nama domain dibalik, lalu diikuti nama programnya.
 * Bagaimana kalau kita tidak mendeklarasikan package?
 * Boleh-boleh saja dan programnya akan tetap bisa jalan.
 * Tapi nanti saat produksi, misalnya saat membuat aplikasi Android.
 * Kita wajib mendeklarasikan package.
 */
package com.online.struktur;

// 3. BAGIAN CLASS
/* Java merupakan bahasa pemrograman yang menggunakan paradigma OOP (Object Oriented Programming).
 * Setiap program harus dibungkus di dalam class agar nanti bisa dibuat menjadi objek.
 * Kalau kamu belum paham apa itu OOP?
 * Cukup pahami class sebagai deklarasi nama program.
 * Ini adalah blok class.
 * Blok class dibuka dengan tanda kurung kurawal { kemudian ditutup atau diakhiri dengan }.
 * Di dalam blok class, kita dapat mengisinya dengan method atau fungsi-fungsi dan juga variabel.
 * Pada contoh di ini, terdapat method main().
 */
class Struktur {

	// 4. METHOD MAIN
	/*
	 * Method main() atau fungsi main() merupakan blok program yang akan dieksekusi
	 * pertama kali. Ini adalah entri point dari program. Method main() wajib kita
	 * buat. Kalau tidak, maka programnya tidak akan bisa dieksekusi. Contoh method
	 * main(). Penulisannya harus seperti ini… Method main() memiliki parameter
	 * args[]. Parameter ini nanti akan menyimpan sebuah nilai dari argumen di
	 * command line.
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
