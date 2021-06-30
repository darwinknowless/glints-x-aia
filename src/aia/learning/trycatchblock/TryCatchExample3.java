package aia.learning.trycatchblock;

//Block class
public class TryCatchExample3 {
	// Method main()
	public static void main(String[] args) {
		// Block try-catch
		try {
			int data = 50 / 0; // may throw exception
			// if exception occurs, the remaining statement will not executed
			System.out.println("rest of the code...");

			// handling the exception
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

// OUTPUT
// java.lang.ArithmeticException: / by zero

/*
 * Here, we can see that if an exception occurs in the try block, the rest of
 * the block code will not execute.
 */