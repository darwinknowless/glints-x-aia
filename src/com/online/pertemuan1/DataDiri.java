// Declare package
package com.online.pertemuan1;

// Block Class
public class DataDiri {
	// Method main()
	public static void main(String[] args) {
		// create variable
		String nama, alamat;
		int usia;
		double tinggi;

		// Input variable
		nama = "Darwin Knowless";
		alamat = "Jakarta";
		usia = 29;
		tinggi = 171.5;

		// Print to screen all variable contains
		System.out.println("Nama: " + nama);
		System.out.println("Alamat: " + alamat);
		System.out.println("Usia: " + usia + " tahun");
		System.out.println("Tinggi: " + tinggi + " cm");
	}
}

// ATURAN PENULISAN VARIABEL
/*
 * Nama variabel tidak boleh menggunakan kata kunci dari Java (reserved word)
 * seperti if, for, switch, dll. Nama variabel boleh menggunakan huruf, angka
 * (0-9), garis bawah (underscore), dan symbol dollar ($), namun penggunaan
 * garis bawah dan symbol lebih baik dihindari. Nama variabel harus diawali
 * dengan huruf kecil, karena Java menggunakan gaya CamelCase. Apabila nama
 * variabel lebih dari 1 suku kata, maka kata ke-2 dituliskan dengan diawali
 * dengan huruf besar dan seterusnya, contoh namaVariabel.
 */
