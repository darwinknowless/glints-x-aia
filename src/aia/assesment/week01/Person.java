package aia.assesment.week01;

//block class
abstract public class Person {
	// declare variable
	private String name;
	private String address;

	// generate getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
