package aia.learning.trycatchblock;

//block class
public class TryCatchExample5 {
	// method main()
	public static void main(String[] args) {
		// block try-catch
		try {
			int data = 50 / 0; // may throw exception

			// handling the exception
		} catch (Exception e) {
			// TODO: handle exception
			// displaying the custom message
			System.out.println("Can't divided by zero");

		}
	}
}

// OUTPUT
// Can't divided by zero