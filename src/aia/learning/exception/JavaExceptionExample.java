package aia.learning.exception;

// Block class
public class JavaExceptionExample {
	// Method main()
	public static void main(String[] args) {
		// Block try catch
		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		// Print result
		System.out.println("rest of the code...");
	}
}

//Result must be like this in the terminal

/*
 * java.lang.ArithmeticException: / by zero rest of the code...
 */
