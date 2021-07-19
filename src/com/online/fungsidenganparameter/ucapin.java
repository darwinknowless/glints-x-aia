package com.online.fungsidenganparameter;

class ucapin {

	// fungsi dengan salam dengan parameter
	static void salam(String ucapan) {
		System.out.println(ucapan);
	}

	/*
	 * Pada contoh tersebut, kita membuat parameter bernama ucapan dengan tipe
	 * String. Sehingga kita bisa menggunakan variabel ucapan di dalam fungsi.
	 */

	// fungsi main()
	public static void main(String[] args) {
		// memanggil/eksekusi fungsi
		salam("Hallo!");
		salam("Selamat datang di pemrograman Java");
		salam("Saya kira ini bagian terakhir");
		salam("Sampai jumpa lagi, ya!");
	}
}
