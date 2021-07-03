package aia.learning.oop;

// block class
public class Interface {
	// TODO : create method main(String[] args)
	public static void main(String[] args) {
		// Komponen kmp = new Komponen();

		Car car = new Car();
		car.design();
		System.out.println(car.getColor());
		System.out.println(car.getShape());

		System.out.println("============");

		Moto moto = new Moto();
		moto.design();
		System.out.println(moto.getColor());
		System.out.println(moto.getShape());
	}

}

// interface -> kontrak class turunannya (harus implement abstract methodnya)
// keyword untuk implementasi interface -> implement
// class yang hanya bersisi method abstract
// dan hanya bisa berisi const (tidak bisa ada variable)

// TODO : create interface class
// parent class
interface KomponenBody {
	String color = "red";

	// access modifier cuma boleh public
	String getColor();

	void design();
}

//TODO : create interface class
//parent class
interface KomponenBan {
	String shape = "bulat";

	String getShape();
}

// TODO : create child class
// must implement parent class
class Car implements KomponenBody, KomponenBan {
	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void design() {
		System.out.println("city car");
	}

	@Override
	public String getShape() {
		return shape;
	}
}

// interface juga bisa di implement di kelas abstract
abstract class SubKomponen implements KomponenBody, KomponenBan {

}

// TODO : create child class
// must implement parent class
class Moto extends SubKomponen {

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void design() {
		System.out.println("Superbike");
	}

	@Override
	public String getShape() {
		return shape;
	}

}