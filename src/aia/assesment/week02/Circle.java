package aia.assesment.week02;

//block class
public class Circle extends Shape {
	// declare variable
	double radius;

	// generate getters & setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	// inheritance from shape.java
	public double getArea(double radius) {
		double area = radius * radius * Math.PI;
		return area;
	}

	@Override
	// inheritance from shape.java
	public double getPerimeter(double radius) {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
}
