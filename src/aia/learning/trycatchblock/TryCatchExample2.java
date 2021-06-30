package aia.learning.trycatchblock;

//Block class
public class TryCatchExample2 {
	// Method main()
	public static void main(String[] args) {
		// Block try-catch
		try {
			int data = 50 / 0; // may throw exception
			// handling the exception
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("rest of code...");
	}
}

//OUTPUT
/*
 * java.lang.ArithmeticException: / by zero rest of the code
 * 
 * Now, as displayed in the above example, the rest of the code is executed,
 * i.e. the rest of the code statement is printed.
 */
