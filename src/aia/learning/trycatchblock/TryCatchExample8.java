package aia.learning.trycatchblock;

//block class
public class TryCatchExample8 {
	// method main()
	public static void main(String[] args) {
		// block try-catch
		try {
			int data = 50 / 0; // may throw exception

			// try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}

// OUTPUT
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at aia.learning.trycatchblock.TryCatchExample8.main(TryCatchExample8.java:9)