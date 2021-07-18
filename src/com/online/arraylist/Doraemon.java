package com.online.arraylist;

import java.util.ArrayList;

// block class
public class Doraemon {

	// method main
	public static void main(String[] args) {

		// create object array list
		ArrayList magicPocket = new ArrayList();

		// input magic pocket with 5 item
		magicPocket.add("Senter Pembesar");
		magicPocket.add(432);
		magicPocket.add("Tikus");
		magicPocket.add(1231234.132);
		magicPocket.add(true);

		// delete "Tikus" from magic pocket
		magicPocket.remove("Tikus");

		// show array inside magic pocket
		System.out.println(magicPocket);

		// show magic pocket contents
		System.out.println("Kantong ajaib berisi " + magicPocket.size() + " item");

	}

}

/*
 * Karena array list (magicPocket) merupakan sebuah objek yang terbuat dari
 * class Array List, maka dia punya method (fungsi) untuk melakukan sesuatu.
 */

// Fungsi add() untuk menambahkan sesuatu ke dalam Array List;
// Fungsi remove() untuk menghapus sesuatu ke dalam Array List;
// Fungsi size() untuk mengambil ukuran Array List;
// Fungsi get(id) untuk mengambil item dalam Array List berdasarkan id atau indeks tertentu.
// ungsi yang lainnya.

/*
 * Kita telah memahami cara penggunaan Array dalam program Java.
 * 
 * Berikut ini ringkasannya:
 */

// Array adalah variabel yang bisa menyimpan banyak data;
// Array bisa multi dimensi;
// Array memiliki beberapa kekurangan, akan tetapi sudah ditutupi oleh array list.