package aia.assesment.week02;

//block class
public class Main {
	// method main()
	public static void main(String[] args) {

		// declare for circle
		Circle newCircle = new Circle();
		newCircle.setRadius(20.0);
		newCircle.toString();
		System.out.println(newCircle.getPerimeter(150.0));

		// declare for rectangle
		Rectangle newRectangle = new Rectangle();
		newRectangle.setWidth(30.0);
		newCircle.toString();
		System.out.println(newRectangle.getArea(100.0));

		// declare for square
		Square newSquare = new Square();
		newCircle.toString();
		System.out.println(newSquare.getArea(20.0));
	}
}
