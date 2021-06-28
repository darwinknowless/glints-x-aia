package aia.assesment.week02;

// abstract Class
abstract class Shape {
	// declare protected attribute
	protected String color = "red";
	protected Boolean filled = true;

	// generate constructor using field
	public Shape(String color, Boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	// generate getter and setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean isFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}

}
