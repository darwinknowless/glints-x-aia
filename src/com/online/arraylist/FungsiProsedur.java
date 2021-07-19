package com.online.arraylist;

// import library
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// block class
public class FungsiProsedur {

	// membuat variabel global
	static ArrayList listBuah = new ArrayList(); // variabel global untuk menyimpan nama-nama buah
	static boolean isRunning = true; // variabel global untuk membuat loop
	// objek yang kita butuhkan untuk mengambil input dari keyboard.
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader input = new BufferedReader(inputStreamReader);

	// TODO : fungsi untuk menampilkan menu
	static void showMenu() throws IOException {
		// kita menggunakan Buffereader, jadi throws IOException wajib ditulis

		System.out.println("========= MENU ========");
		System.out.println("[1] Show All Buah");
		System.out.println("[2] Insert Buah");
		System.out.println("[3] Edit Buah");
		System.out.println("[4] Delete Buah");
		System.out.println("[5] Exit");
		System.out.print("PILIH MENU> ");

		int selectedMenu = Integer.valueOf(input.readLine());
		// Switch Case Loop
		switch (selectedMenu) {
		case 1:
			showAllBuah();
			break;
		case 2:
			insertBuah();
			break;
		case 3:
			editBuah();
			break;
		case 4:
			deleteBuah();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Pilihan salah!");

		}

	}

	// TODO : fungsi untuk menampilkan data
	static void showAllBuah() {
		if (listBuah.isEmpty()) {
			System.out.println("Belum ada data");
		} else {
			// tampilkan semua buah
			for (int i = 0; i < listBuah.size(); i++) {
				System.out.println(String.format("[%d] %s", i, listBuah.get(i)));
			}
		}
	}

	// TODO : fungsi untuk menambah buah
	static void insertBuah() throws IOException {
		System.out.print("Nama buah: ");
		String namaBuah = input.readLine();
		// TODO : Method tambah data
		listBuah.add(namaBuah);
	}

	// TODO : fungsi untuk mengubah data buah
	static void editBuah() throws IOException {
		showAllBuah();
		System.out.print("Pilih nomer buah: ");
		int indexBuah = Integer.valueOf(input.readLine());

		System.out.print("Nama Baru: ");
		String namaBaru = input.readLine();

		// TODO : Method update data(ganti nama)
		listBuah.set(indexBuah, namaBaru);
	}

	// TODO : Fungsi untuk menghapus buah
	static void deleteBuah() throws IOException {
		showAllBuah();
		System.out.print("Pilih nomer buah: ");
		int indexBuah = Integer.valueOf(input.readLine());
		// TODO : Method hapus data
		listBuah.remove(indexBuah);
	}

	// TODO : Methodfunction main()
	public static void main(String[] args) throws IOException {
		// do while loop
		do {
			showMenu();
		} while (isRunning);

	}

}
