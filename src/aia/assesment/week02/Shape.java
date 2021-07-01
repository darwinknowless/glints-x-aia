package aia.assesment.week02;

// block class
public abstract class Shape {

	// declare variable
	private String color;
	private boolean filled;

	// generate getter and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled(Boolean filled) {
		return filled;
	};

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}

	// abstract
	abstract double getArea(double length);

	abstract double getPerimeter(double length);
}
