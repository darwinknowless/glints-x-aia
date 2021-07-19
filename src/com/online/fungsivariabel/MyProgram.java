package com.online.fungsivariabel;

class MyProgram {

	// ini variabel global
	static String nama = "MyProgram";
	static String version = "1.0.0";

	static void help() {

		// ini variabel lokal
		String nama = "Darwin Knowless";

		// mengakses variabel global di dalam fungsi help()
		System.out.println("Nama: " + nama);
		System.out.println("Versi: " + version);
	}

	// fungsi main()
	public static void main(String args[]) {

		// panggil fungsi help()
		help();
		/*
		 * Saat pemanggilan fungsi help() kita membuat ulang variabel nama. Sehingga
		 * variabel nama menjadi variabel lokal pada fungsi help() dan nilainya berubah
		 * menjadi "Darwin Knowless".
		 */

		System.out.println("Nama: " + nama);
		System.out.println("Versi: " + version);

	}

}
/*
 * Sedangkan, saat kita akases lagi variabel nama melalui fungsi main() nilainya
 * tetap sama seperti yang didefinisikan.
 */
