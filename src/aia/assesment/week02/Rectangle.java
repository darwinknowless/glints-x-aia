package aia.assesment.week02;

//block class
public class Rectangle extends Shape {
	// declare variable
	private double width;
	private double length;

	// generate getters & setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	// inheritance from shape.java
	@Override
	public double getArea(double length) {
		double area = length * width;
		return area;
	}

	// inheritance from shape.java
	@Override
	public double getPerimeter(double length) {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
}
