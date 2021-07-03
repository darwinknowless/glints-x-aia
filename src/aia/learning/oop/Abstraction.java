package aia.learning.oop;

public class Abstraction {
	// method main(String[] args)
	// method yg pertama kali di jalankan
	public static void main(String[] args) {

		// Shape shape = new Shape();
		Shape kotak = new Rectangle();
		kotak.sisi = 4;
		kotak.printSisi();
		System.out.println("Keliling kotak : " + kotak.getKeliling());

		Shape segitiga = new Triangle();
		segitiga.sisi = 5;
		segitiga.printSisi();
		System.out.println("keliling segitiga : " + segitiga.getKeliling());
	}

}

// class abstraction -> class yang masih abtract (belum konkrit)
// tidak bisa di intansiate, hanya bisa diturunkan ke child
// bisa membuat abstract method, variable, method
// create abstract class
// parent class
abstract class Shape {
	// declare variabel
	int sisi;

	// create public class
	public Shape() {
		System.out.println("Shape dibikin");
	}

	// method abstract
	// hanya di inisasi, tapi tidak ada implementasinya
	// setiap turunannya abstract class harus implement abstract method
	abstract float getKeliling();

	void printSisi() {
		System.out.println("sisi : " + sisi);
	}
}

// child class
class Triangle extends Shape {
	// abstract method hanya bisa di dalam class abstract dan interface
	// abstract int hallo();
	@Override
	float getKeliling() {
		return super.sisi * 3;
	}
}

//child class
class Rectangle extends Shape {
	@Override
	float getKeliling() {
		return super.sisi * 4;
	}

	@Override
	void printSisi() {
		System.out.println("sisi kotak : " + sisi);
	}

	void tambahPanjangSisi() {
		super.sisi = super.sisi + 1;
	}
}