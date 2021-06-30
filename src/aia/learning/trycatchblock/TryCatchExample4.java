package aia.learning.trycatchblock;

//block class
public class TryCatchExample4 {
	// method main()
	public static void main(String[] args) {
		// block try-catch
		try {
			int data = 50 / 0; // nay throw exception

			// handling the exception by using exception class
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}

// OUTPUT
// java.lang.ArithmeticException: / by zero
// rest of the code...
