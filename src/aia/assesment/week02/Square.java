package aia.assesment.week02;

//block class
public class Square extends Rectangle {
	// declare variable
	private double side;
	private String color;
	private boolean filled;

	// generate setters & getters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override // from rectangle
	public void setWidth(double side) {
	}

	@Override // from rectangle
	public void setLength(double side) {
	}

	@Override // from shape
	public double getArea(double side) {
		double area = side * side;
		return area;
	}

	@Override // from shape
	public double getPerimeter(double side) {
		double perimeter = 4 * side;
		return perimeter;
	}
}
